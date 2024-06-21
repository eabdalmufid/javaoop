package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextField tfNIM, tfNama, tfTugas1, tfTugas2, tfTugas3, tfTugas4, tfTugas5, tfUTS, tfUAS;
    private JTextArea taOutput;
    private JRadioButton rbA, rbB, rbC;
    private JComboBox<String> cbKelompok;
    private JButton btnSave, btnExit, btnNilaiAkhir;

    public MainFrame() {
        setTitle("Lembar Penilaian");
        setSize(310, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNIM = new JLabel("NIM");
        lblNIM.setBounds(20, 20, 100, 20);
        add(lblNIM);

        tfNIM = new JTextField();
        tfNIM.setBounds(120, 20, 150, 20);
        add(tfNIM);

        JLabel lblNama = new JLabel("Nama");
        lblNama.setBounds(20, 50, 100, 20);
        add(lblNama);

        tfNama = new JTextField();
        tfNama.setBounds(120, 50, 150, 20);
        add(tfNama);

        JLabel lblKelas = new JLabel("Kelas");
        lblKelas.setBounds(20, 80, 100, 20);
        add(lblKelas);

        rbA = new JRadioButton("A");
        rbA.setBounds(120, 80, 50, 20);
        add(rbA);

        rbB = new JRadioButton("B");
        rbB.setBounds(170, 80, 50, 20);
        add(rbB);

        rbC = new JRadioButton("C");
        rbC.setBounds(220, 80, 50, 20);
        add(rbC);

        ButtonGroup bgKelas = new ButtonGroup();
        bgKelas.add(rbA);
        bgKelas.add(rbB);
        bgKelas.add(rbC);

        JLabel lblKelompok = new JLabel("Kelompok");
        lblKelompok.setBounds(20, 110, 100, 20);
        add(lblKelompok);

        cbKelompok = new JComboBox<>(new String[]{"1", "2", "3", "4"});
        cbKelompok.setBounds(120, 110, 150, 20);
        add(cbKelompok);

        JLabel lblTugas1 = new JLabel("Tugas1");
        lblTugas1.setBounds(20, 140, 100, 20);
        add(lblTugas1);

        tfTugas1 = new JTextField();
        tfTugas1.setBounds(120, 140, 150, 20);
        add(tfTugas1);

        JLabel lblTugas2 = new JLabel("Tugas2");
        lblTugas2.setBounds(20, 170, 100, 20);
        add(lblTugas2);

        tfTugas2 = new JTextField();
        tfTugas2.setBounds(120, 170, 150, 20);
        add(tfTugas2);

        JLabel lblTugas3 = new JLabel("Tugas3");
        lblTugas3.setBounds(20, 200, 100, 20);
        add(lblTugas3);

        tfTugas3 = new JTextField();
        tfTugas3.setBounds(120, 200, 150, 20);
        add(tfTugas3);

        JLabel lblTugas4 = new JLabel("Tugas4");
        lblTugas4.setBounds(20, 230, 100, 20);
        add(lblTugas4);

        tfTugas4 = new JTextField();
        tfTugas4.setBounds(120, 230, 150, 20);
        add(tfTugas4);

        JLabel lblTugas5 = new JLabel("Tugas5");
        lblTugas5.setBounds(20, 260, 100, 20);
        add(lblTugas5);

        tfTugas5 = new JTextField();
        tfTugas5.setBounds(120, 260, 150, 20);
        add(tfTugas5);

        JLabel lblUTS = new JLabel("UTS");
        lblUTS.setBounds(20, 290, 100, 20);
        add(lblUTS);

        tfUTS = new JTextField();
        tfUTS.setBounds(120, 290, 150, 20);
        add(tfUTS);

        JLabel lblUAS = new JLabel("UAS");
        lblUAS.setBounds(20, 320, 100, 20);
        add(lblUAS);

        tfUAS = new JTextField();
        tfUAS.setBounds(120, 320, 150, 20);
        add(tfUAS);

        btnSave = new JButton("Save");
        btnSave.setBounds(20, 350, 123, 20);
        add(btnSave);

        btnNilaiAkhir = new JButton("Nilai Akhir");
        btnNilaiAkhir.setBounds(150, 350, 123, 20);
        add(btnNilaiAkhir);

        btnExit = new JButton("Exit");
        btnExit.setBounds(20, 375, 250, 20);
        add(btnExit);

        taOutput = new JTextArea();
        taOutput.setBounds(20, 410, 250, 325);
        add(taOutput);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = tfNIM.getText();
                String nama = tfNama.getText();
                String kelas = rbA.isSelected() ? "A" : rbB.isSelected() ? "B" : "C";
                String kelompok = (String) cbKelompok.getSelectedItem();

                taOutput.setText("NIM: " + nim + "\nNama: " + nama + "\nKelas: " + kelas + "\nKelompok: " + kelompok
                        + "\nTugas1: " + tfTugas1.getText() + "\nTugas2: " + tfTugas2.getText()
                        + "\nTugas3: " + tfTugas3.getText() + "\nTugas4: " + tfTugas4.getText()
                        + "\nTugas5: " + tfTugas5.getText() + "\nUTS: " + tfUTS.getText() + "\nUAS: " + tfUAS.getText());
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnNilaiAkhir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tugas1 = Double.parseDouble(tfTugas1.getText());
                double tugas2 = Double.parseDouble(tfTugas2.getText());
                double tugas3 = Double.parseDouble(tfTugas3.getText());
                double tugas4 = Double.parseDouble(tfTugas4.getText());
                double tugas5 = Double.parseDouble(tfTugas5.getText());
                double uts = Double.parseDouble(tfUTS.getText());
                double uas = Double.parseDouble(tfUAS.getText());

                double nilaiAkhir = (0.2 * ((tugas1 + tugas2 + tugas3 + tugas4 + tugas5) / 5)) + (0.3 * uts) + (0.5 * uas);

                taOutput.append("\nNilai Akhir: " + nilaiAkhir);
            }
        });
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}
