package array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("몇개 입력할래?");
        int num = scan.nextInt();


        int[] ary = new int [num];   //초기화


        System.out.println(num + "개의 숫자 입력");

        for (int i = 0 ; i < num ; i++) {
            ary[i] = scan.nextInt();

        }

        int max = ary[0];
        int min = ary[0];

        for (int i = 0 ; i < num ; i++) {

            if (max > ary[i]) {
                max = ary[i];

            }
            if (min < ary[i]) {
                min = ary[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }
}
