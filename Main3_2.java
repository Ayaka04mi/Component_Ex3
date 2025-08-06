package Ex3_2;

import java.util.Scanner;

public class Main3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LiveScoreBean liveScore = new LiveScoreBean();

        SubscriberProperty subscriber1 = new SubscriberProperty();
        SubscriberProperty subscriber2 = new SubscriberProperty();

        liveScore.addPropertyChangeListener(subscriber1);
        liveScore.addPropertyChangeListener(subscriber2);

        while (true) {
            System.out.print("Enter Score ");
            
            String input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Exiting program.");
                break;
            }

            liveScore.setScoreLine(input);
        }

        sc.close();

    }
}
