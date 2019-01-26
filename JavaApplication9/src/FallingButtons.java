
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FallingButtons {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }

    private static void createAndShowGui() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int rows = 8;
        int cols = 8;
        GridPanel gridPanel = new GridPanel(rows, cols);
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                JButton button = new JButton(r + "," + c);
                gridPanel.addComponentInGrid(r, c, button);

                button.addActionListener(e
                        -> {
                    Point coordinates = gridPanel.getCoordinatesInGrid(button);
                    if (coordinates != null) {
                        gridPanel.removeComponentInGrid(
                                coordinates.x, coordinates.y);
                    }
                });
            }
        }
        f.getContentPane().add(gridPanel);

        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

class GridPanel extends JPanel {

    private final int rows;
    private final int cols;
    private final JComponent components[][];

    GridPanel(int rows, int cols) {
        super(null);
        this.rows = rows;
        this.cols = cols;
        this.components = new JComponent[rows][cols];

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                layoutGrid();
            }
        });
    }

    private void layoutGrid() {
        int cellWidth = getWidth() / cols;
        int cellHeight = getHeight() / rows;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                JComponent component = components[r][c];
                if (component != null) {
                    component.setBounds(
                            c * cellWidth, r * cellHeight, cellWidth, cellHeight);
                }
            }
        }
    }

    Point getCoordinatesInGrid(JComponent component) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (components[r][c] == component) {
                    return new Point(r, c);
                }
            }
        }
        return null;
    }

    void addComponentInGrid(int row, int col, JComponent component) {
        add(component);
        components[row][col] = component;
        layoutGrid();
    }

    JComponent getComponentInGrid(int row, int col) {
        return components[row][col];
    }

    void removeComponentInGrid(int row, int col) {
        remove(components[row][col]);
        components[row][col] = null;

        List<Runnable> animations = new ArrayList<Runnable>();
        for (int r = row - 1; r >= 0; r--) {
            JComponent component = components[r][col];
            if (component != null) {
                Runnable animation
                        = createAnimation(component, r, col, r + 1, col);
                animations.add(animation);
            }
        }
        for (Runnable animation : animations) {
            Thread t = new Thread(animation);
            t.setDaemon(true);
            t.start();
        }
        repaint();
    }

    private Runnable createAnimation(JComponent component,
            int sourceRow, int sourceCol, int targetRow, int targetCol) {
        int cellWidth = getWidth() / cols;
        int cellHeight = getHeight() / rows;
        Rectangle sourceBounds = new Rectangle(
                sourceCol * cellWidth, sourceRow * cellHeight,
                cellWidth, cellHeight);
        Rectangle targetBounds = new Rectangle(
                targetCol * cellWidth, targetRow * cellHeight,
                cellWidth, cellHeight);
        Runnable movement = createAnimation(
                component, sourceBounds, targetBounds);
        return ()
                -> {
            components[sourceRow][sourceCol] = null;
            movement.run();
            components[targetRow][targetCol] = component;
            repaint();
        };
    }

    private static Runnable createAnimation(JComponent component,
            Rectangle sourceBounds, Rectangle targetBounds) {
        int delayMs = 10;
        int steps = 20;
        Runnable r = ()
                -> {
            int x0 = sourceBounds.x;
            int y0 = sourceBounds.y;
            int w0 = sourceBounds.width;
            int h0 = sourceBounds.height;

            int x1 = targetBounds.x;
            int y1 = targetBounds.y;
            int w1 = targetBounds.width;
            int h1 = targetBounds.height;

            int dx = x1 - x0;
            int dy = y1 - y0;
            int dw = w1 - w0;
            int dh = h1 - h0;

            for (int i = 0; i < steps; i++) {
                double alpha = (double) i / (steps - 1);

                int x = (int) (x0 + dx * alpha);
                int y = (int) (y0 + dy * alpha);
                int w = (int) (w0 + dw * alpha);
                int h = (int) (h0 + dh * alpha);
                SwingUtilities.invokeLater(()
                        -> {
                    component.setBounds(x, y, w, h);
                });
                try {
                    Thread.sleep(delayMs);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            SwingUtilities.invokeLater(()
                    -> {
                component.setBounds(x1, y1, w1, h1);
            });
        };
        return r;
    }

}
