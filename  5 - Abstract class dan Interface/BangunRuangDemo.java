package tugaslima;

/**
 *
 * @author afidev
 */
public class BangunRuangDemo {
  public static void main(String[] args) {
    // Buat objek Balok
    Balok balok = new Balok(5.0, 3.0, 4.0);

    // Hitung dan tampilkan luas permukaan dan volume balok
    System.out.println("Luas permukaan balok: " + balok.getLuasPermukaan());
    System.out.println("Volume balok: " + balok.getVolume());

    // Buat objek Prisma
    Prisma prisma = new Prisma(4.0, Math.sqrt(3), 6.0, 3);

    // Hitung dan tampilkan luas permukaan dan volume prisma
    System.out.println("\nLuas permukaan prisma: " + prisma.getLuasPermukaan());
    System.out.println("Volume prisma: " + prisma.getVolume());
  }
}
