import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        int arr[] = new int[C];

        for (int i = 0; i < C; i++) {
            int A = scanner.nextInt();
            int B =  scanner.nextInt();
            arr[i] = A + B;
        }
        for ( int D : arr) {
            System.out.println(D);
        }
    }
}