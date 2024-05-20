package scanner;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("구구단 몇단이 필요 해요?");
        int a = scan.nextInt();

        for (int i =1 ; i <=9 ; i++) {
            int m = a*i;
            System.out.println(a + "*" + i + " = " + m);
        }
    }
}
