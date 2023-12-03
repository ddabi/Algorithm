import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int div = n / 4;
        
        for(int i = 0; i < div; i++) {
            System.out.println("long");
        }
        System.out.println("int");
    }
}