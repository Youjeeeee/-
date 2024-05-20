package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자 입력");
        String str = scanner.nextLine();
        System.out.println("입력한건 :" + str);

        System.out.println("정수 입력");
        int a = scanner.nextInt();
        System.out.println("입력 정수 :" + a);

        System.out.println("실수 입력");
        double d = scanner.nextDouble();
        System.out.println("입력 실수 :" + d);
    }
}
