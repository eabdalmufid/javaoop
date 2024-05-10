package ujiantengahsemester;

/**
 * Muhammad Ilham Abdul Mufid 2203015148
 */
class Universitas {

    private final String namaUniversitas;

    public Universitas(String namaUniversitas) {
        this.namaUniversitas = namaUniversitas;
    }

    public void tampilkanNamaUniversitas() {
        System.out.println("Nama Universitas: " + namaUniversitas);
    }
}

class Biodata extends Universitas {

    private final String nim;
    private final String namaLengkap;
    private final String alamat;
    private final String tanggalLahir;

    public Biodata(String namaUniversitas, String nim, String namaLengkap, String alamat, String tanggalLahir) {
        super(namaUniversitas);
        this.nim = nim;
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
    }

    public void tampilkanBiodata() {
        tampilkanNamaUniversitas();
        System.out.println("NIM: " + nim);
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }
}

public class Main {

    public static void main(String[] args) {
        Biodata biodata = new Biodata("UHAMKA", "2203015148", "Muhammad Ilham Abdul Mufid", "Regalia No. 69", "05/03/2003");
        biodata.tampilkanBiodata();
    }
}
