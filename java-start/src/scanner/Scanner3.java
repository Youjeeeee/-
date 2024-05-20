package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1번 정수입력");
        int a = scanner.nextInt();

        System.out.println("2번 정수입력");
        int b = scanner.nextInt();

        int c = a > b ? a : b ;
        System.out.println("큰 수는 =" + c);
    }
}
