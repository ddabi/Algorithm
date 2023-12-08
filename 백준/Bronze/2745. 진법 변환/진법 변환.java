import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        int b = scanner.nextInt();
        int tmp = 1;    // 곱셈을 위한 변수
        int result = 0;

        for(int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (c - 55) * tmp;   // 알파벳 범위 안의 문자라면 55 빼기
            } else {
                result += (c - 48) * tmp;   // 알파벳 아니라면 48 빼기
            }
            tmp *= b;
        }
        System.out.println(result);
    }
}