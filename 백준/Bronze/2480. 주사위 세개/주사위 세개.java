import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A == B && A == C) {
            System.out.println(10000 + A * 1000);
        } else if (A == B && A != C) {
            System.out.println(1000 + A * 100);
        } else if (A == C && A != B) {
            System.out.println(1000 + A * 100);
        } else if (B == C && B != A) {
            System.out.println(1000 + B * 100);
        } else {
            int max = A;
            if (max < B) max = B;
            if (max < C) max = C;
            System.out.println(max * 100);
        }
    }
}