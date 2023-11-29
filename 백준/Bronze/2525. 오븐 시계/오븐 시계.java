import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minuit = scanner.nextInt();
        int finish = scanner.nextInt();

        hour += finish / 60;
        minuit += finish % 60;
        
        if ( minuit >= 60) {
            hour += 1;
            minuit -= 60;
        }
        if ( hour >= 24) {
            hour -= 24;
        }
        System.out.println(hour + " " + minuit);
    }
}