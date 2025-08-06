
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        ScoreSoure scoreSoure = new ScoreSoure();
        Scanner sc = new Scanner(System.in);

        scoreSoure.addScoreListener(new Subscriber());
        scoreSoure.addScoreListener(new Subscriber());

       

        while (true) {
            System.out.print("Enter Score ");
            
            String input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Exiting program.");
                break;
            }

            scoreSoure.setScoreLine(input);
        }

        sc.close();
    }
}
