package modulempat;

/**
 *
 * @author afidev
 */
import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args) {
        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("Apa ibukota Indonesia?");
        first.addChoice("Maluku", false);
        first.addChoice("Medan", false);
        first.addChoice("Jakarta", true);
        first.addChoice("Padang", false);
        //first.setAnswer("Jakarta");

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("Hak Asasi Manusia diatur oleh UUD pasal?");
        second.addChoice("27", false);
        second.addChoice("28", true);
        second.addChoice("29", false);
        second.addChoice("20", false);
        //second.setAnswer("28");

        presentQuestion(first);
        //System.out.println("");
        presentQuestion(second);
        //String response = in.nextLine();
        //System.out.println(first.checkAnswer(response));
        //System.out.println(second.checkAnswer(response));
        //in.close();
    }

    public static void presentQuestion(ChoiceQuestion q) {
        Scanner in = new Scanner(System.in);
        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
