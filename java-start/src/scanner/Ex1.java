package scanner;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("너의 이름은?");
        String name = scanner.nextLine();

        System.out.println("너의 나이는?");
        int age = scanner.nextInt();

        System.out.println("이름 :" + name + "나이" + age + "인가보군요");
    }
}
