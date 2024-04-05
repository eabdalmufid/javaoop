package modultiga;

/**
 *
 * @author afidev
 */
import java.io.*;

public class NilaiMHS {
    private double uas, uts;
    private int password;

    public NilaiMHS(double uas, double uts) {
        this.uas = uas;
        this.uts = uts;
    }

    public static String bacainputan() {
        String baca = " ";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(input);

        try {
            baca = buf.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        return baca;
    }

    public void cetak() {
        System.out.println("Berikut adalah nilai Praktikum PBO kamu");
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Rata-rata: " + (uas + uts) / 2);
    }

    public void getNilai() {
        System.out.print("Masukkan password: ");
        password = Integer.parseInt(bacainputan());
        if (password == 123) {
            cetak();
        } else {
            System.out.println("Password salah ");
        }
    }
}
