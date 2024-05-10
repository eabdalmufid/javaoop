package ujiantengahsemester;

/**
 * Muhammad Ilham Abdul Mufid 2203015148
 */
public class Mahasiswa {

    private String nim;
    private String name;
    private String kelas;

    public Mahasiswa(String nim, String name, String kelas) {
        this.nim = nim;
        this.name = name;
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getKelas() {
        return kelas;
    }

    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Kelas: " + kelas);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("2203015148", "Muhammad Ilham Abdul Mufid", "TI-4B");
        mahasiswa.displayInfo();
    }
}
