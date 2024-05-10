package ujiantengahsemester;

/**
 * Muhammad Ilham Abdul Mufid 2203015148
 */
public class NilaiBergantian {

    private static int nilai = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (nilai) {
                case 0 -> {
                    System.out.print("0 ");
                    nilai = 2;
                }
                case 1 -> {
                    System.out.print("1 ");
                    nilai = 2;
                }
                case 2 -> {
                    System.out.print("2 ");
                    nilai = 0;
                }
            }
        }
    }
}
