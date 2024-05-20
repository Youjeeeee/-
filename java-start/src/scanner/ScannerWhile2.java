package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("정수를 입력 (0입력 종료)");
            int a = input.nextInt();

            if (a ==0) {
                break;
            }

            sum = sum + a;
        }

        System.out.println("총합은 =" + sum);
    }
}
