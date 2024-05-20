package scanner;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int temp = 0;

        System.out.println("1번 정수");
        int a = scan.nextInt();

        System.out.println("2번 정수");
        int b = scan.nextInt();

        if ( a >= b) {
            temp = b;
            b = a;
            a = temp;
        }
        System.out.println("두 수의 사이 숫자는 :");
        for (int c = a+1 ; c <b ; c++) {
            System.out.print(c);
            if (c != b-1) {
                System.out.print(",");
            }
        }

    }
}
