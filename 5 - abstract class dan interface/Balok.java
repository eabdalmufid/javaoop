package tugaslima;

/**
 *
 * @author afidev
 */
public class Balok implements BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double getLuasPermukaan() {
        double luasAlas = panjang * lebar;
        double luasSisi = 2 * (lebar * tinggi + panjang * tinggi);
        return 2 * luasAlas + luasSisi;
    }

    @Override
    public double getVolume() {
        return panjang * lebar * tinggi;
    }

    // Getter dan setter untuk atribut
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
