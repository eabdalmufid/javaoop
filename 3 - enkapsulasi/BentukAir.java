package modultiga;

/**
 *
 * @author afidev
 */
public class BentukAir {
    private int temperature;

    public BentukAir(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        if (temperature < 0) {
            return "Es - beku";
        } else if (temperature == 0) {
            return "Transisi es dan air";
        } else if (temperature > 0 && temperature < 100) {
            return "Air - cair";
        } else if (temperature == 100) {
            return "Transisi cair dan uap";
        } else {
            return "Uap - gas";
        }
    }

    public static void main(String[] args) {
        BentukAir suhu1 = new BentukAir(-10);
        BentukAir suhu2 = new BentukAir(0);
        BentukAir suhu3 = new BentukAir(10);
        BentukAir suhu4 = new BentukAir(100);
        BentukAir suhu5 = new BentukAir(110);
        
        System.out.println("Air bersuhu : -10.0\nBerbentuk : " + suhu1.toString());
        System.out.println("Air bersuhu : 0.0\nBerbentuk : " + suhu2.toString());
        System.out.println("Air bersuhu : 10.0\nBerbentuk : " + suhu3.toString());
        System.out.println("Air bersuhu : 100.0\nBerbentuk : " + suhu4.toString());
        System.out.println("Air bersuhu : 110.0\nBerbentuk : " + suhu5.toString());
    }
}