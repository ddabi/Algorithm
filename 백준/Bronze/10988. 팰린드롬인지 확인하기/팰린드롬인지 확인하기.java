import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        int len = str.length();
        int ans = 1;
        
        for(int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}