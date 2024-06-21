package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class LayoutTester extends JFrame {

    private JButton button1, button2, button3, button4, button5;
    private JPanel panel;

    public LayoutTester() {
        super("Layout Tester");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create the buttons
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");

        // Create the panel
        panel = new JPanel();

        // Add the buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        // Set the layout of the panel
        setFlowLayout();

        // Add the panel to the frame
        add(panel, BorderLayout.CENTER);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Layout");
        JMenuItem flowLayoutMenuItem = new JMenuItem("Flow Layout");
        JMenuItem borderLayoutMenuItem = new JMenuItem("Border Layout");
        JMenuItem gridLayoutMenuItem = new JMenuItem("Grid Layout");
        menu.add(flowLayoutMenuItem);
        menu.add(borderLayoutMenuItem);
        menu.add(gridLayoutMenuItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Add action listeners to the menu items
        flowLayoutMenuItem.addActionListener((ActionEvent e) -> {
            setFlowLayout();
        });
        borderLayoutMenuItem.addActionListener((ActionEvent e) -> {
            setBorderLayout();
        });
        gridLayoutMenuItem.addActionListener((ActionEvent e) -> {
            setGridLayout();
        });

        // Show the frame
        setVisible(true);
    }

    private void setFlowLayout() {
        panel.setLayout(new FlowLayout());
        panel.revalidate();
        panel.repaint();
    }

    private void setBorderLayout() {
        panel.setLayout(new BorderLayout());
        panel.revalidate();
        panel.repaint();
    }

    private void setGridLayout() {
        panel.setLayout(new GridLayout(2, 3));
        panel.revalidate();
        panel.repaint();
    }

    public static void main(String[] args) {
        new LayoutTester();
    }
}
