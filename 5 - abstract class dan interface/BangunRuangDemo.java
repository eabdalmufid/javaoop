package tugaslima;

/**
 *
 * @author afidev
 */
public class BangunRuangDemo {
  public static void main(String[] args) {
    Balok balok = new Balok(5.0, 3.0, 4.0);

    System.out.println("Luas permukaan balok: " + balok.getLuasPermukaan());
    System.out.println("Volume balok: " + balok.getVolume());

    Prisma prisma = new Prisma(4.0, Math.sqrt(3), 6.0, 3);

    System.out.println("\nLuas permukaan prisma: " + prisma.getLuasPermukaan());
    System.out.println("Volume prisma: " + prisma.getVolume());
  }
}
