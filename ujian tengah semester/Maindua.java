package ujiantengahsemester;

/**
 * Muhammad Ilham Abdul Mufid 2203015148
 */
abstract class Diskon {

    protected double diskon;

    public Diskon(double diskon) {
        this.diskon = diskon;
    }

    public abstract double hitungDiskon(double harga);
}

class DiskonTambahan extends Diskon {

    protected double diskonTambahan;

    public DiskonTambahan(double diskon, double diskonTambahan) {
        super(diskon);
        this.diskonTambahan = diskonTambahan;
    }

    @Override
    public double hitungDiskon(double harga) {
        return harga * (1 - diskon / 100) * (1 - diskonTambahan / 100);
    }
}

public class Maindua {

    public static void main(String[] args) {
        Diskon diskon = new DiskonTambahan(60, 10);
        double hargaAwal = 120000.00;
        double hargaSetelahDiskon = diskon.hitungDiskon(hargaAwal);
        System.out.println("Total uang yang harus dibayarkan Raisa: " + hargaSetelahDiskon);
    }
}
