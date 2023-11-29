import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int Hour = in.nextInt();
        int Minute = in.nextInt();
        in.close();

        if (Minute < 45) {
            Hour --;
            Minute = 60 - (45 - Minute);
            if (Hour < 0) {
                Hour = 23;
            }
            System.out.println(Hour + " " + Minute);
        }
        else {
            System.out.println(Hour + " " + (Minute - 45));
        }
    }
}