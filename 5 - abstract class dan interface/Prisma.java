package tugaslima;

/**
 *
 * @author afidev
 */
public class Prisma implements BangunRuang {
    private double alas;
    private double tinggiAlas;
    private double tinggiPrisma;
    private int jumlahSisiAlas;

    public Prisma(double alas, double tinggiAlas, double tinggiPrisma, int jumlahSisiAlas) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
        this.jumlahSisiAlas = jumlahSisiAlas;
    }

    @Override
    public double getLuasPermukaan() {
        double luasAlas = getLuasAlasSegiN(alas, jumlahSisiAlas);
        double luasSisiTegak = jumlahSisiAlas * alas * tinggiPrisma;
        return 2 * luasAlas + luasSisiTegak;
    }

    @Override
    public double getVolume() {
        return alas * tinggiAlas * tinggiPrisma;
    }

    private double getLuasAlasSegiN(double sisi, int jumlahSisi) {
        return switch (jumlahSisi) {
            case 3 -> Math.sqrt(3) * sisi * sisi / 4;
            case 4 -> sisi * sisi;
            default -> 0;
        };
    }

    // Getter dan setter untuk atribut
    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggiAlas() {
        return tinggiAlas;
    }

    public void setTinggiAlas(double tinggiAlas) {
        this.tinggiAlas = tinggiAlas;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public int getJumlahSisiAlas() {
        return jumlahSisiAlas;
    }

    public void setJumlahSisiAlas(int jumlahSisiAlas) {
        this.jumlahSisiAlas = jumlahSisiAlas;
    }
}
