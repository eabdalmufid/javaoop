package ujiantengahsemester;

/**
 * Muhammad Ilham Abdul Mufid 2203015148
 */
public class VolumeKubus {

    private final int sisi;

    public VolumeKubus(int sisi) {
        this.sisi = sisi;
    }

    public int hitungVolume() {
        return sisi * sisi * sisi;
    }

    public static void main(String[] args) {
        int nim = 48;
        int sisiKubus = nim % 100;

        VolumeKubus kubus = new VolumeKubus(sisiKubus);
        int volume = kubus.hitungVolume();

        System.out.println("Volume kubus: " + volume);
    }
}
