package tugasenam;

/**
 *
 * @author Afidev
 */
public class Mobil {
    private String merk;
    private int harga;

    public Mobil(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public void infoMobil() {
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Harga Mobil: " + harga);
    }

    public class MusicPlayer {
        private String brand;
        private String type;

        public MusicPlayer(String brand, String type) {
            this.brand = brand;
            this.type = type;
        }

        public void playMusic() {
            System.out.println("Now playing music on " + brand + " " + type);
        }
    }

    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 20000);
        mobil.infoMobil();

        MusicPlayer musicPlayer = mobil.new MusicPlayer("Sony", "CD Player");
        musicPlayer.playMusic();
    }
}
