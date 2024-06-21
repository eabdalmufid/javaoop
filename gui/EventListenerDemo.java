package gui;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class EventListenerDemo extends JFrame {

    private JCheckBox checkBox;
    private JPanel panel;
    private JButton addButton, removeButton;

    public EventListenerDemo() {
        super("Event Listener Demo");

        // Buat komponen GUI
        checkBox = new JCheckBox("Centang Saya");
        panel = new JPanel();
        addButton = new JButton("Tambahkan Panel");
        removeButton = new JButton("Hapus Panel");

        // Tambahkan komponen ke frame
        add(checkBox, "North");
        add(panel, "Center");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        add(buttonPanel, "South");

        // Tambahkan event listener
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Status kotak centang berubah: " + e.getStateChange());
            }
        });

        panel.addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {
                System.out.println("Hierarki panel berubah: " + e.getChangeFlags());
            }
        });

        addButton.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                System.out.println("Tombol 'Tambahkan Panel' ditambahkan ke leluhur: " + e.getAncestor());
            }

            @Override
            public void ancestorRemoved(AncestorEvent e) {
                System.out.println("Tombol 'Tambahkan Panel' dihapus dari leluhur: " + e.getAncestor());
            }

            @Override
            public void ancestorMoved(AncestorEvent e) {
                // Metode ini tidak digunakan dalam contoh ini.
            }
        });

        removeButton.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                System.out.println("Tombol 'Hapus Panel' ditambahkan ke leluhur: " + e.getAncestor());
            }

            @Override
            public void ancestorRemoved(AncestorEvent e) {
                System.out.println("Tombol 'Hapus Panel' dihapus dari leluhur: " + e.getAncestor());
            }

            @Override
            public void ancestorMoved(AncestorEvent e) {
                // Metode ini tidak digunakan dalam contoh ini.
            }
        });

        // Atur ukuran dan visibilitas frame
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EventListenerDemo();
    }
}