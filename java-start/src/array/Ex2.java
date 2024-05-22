package array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("몇개 정수 입력 할래?");
        int a = scan.nextInt();

        System.out.println(a + "개의 정수를 입력하세여");
        int[] ary = new int[a];

        for (int i = 0 ; i <a ; i++) {
            ary[i] = scan.nextInt();
        }
        for (int i = 0 ; i <a ; i++) {
            System.out.print(ary[i]);
        }


    }
}
