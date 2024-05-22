package array;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        int[] pro = new int[10];
        String[] name = new String[10];
        int i = 0;

        for (;;) {

            System.out.println("1. 상품등록");
            System.out.println("2. 상품목록");
            System.out.println("3. 종료");
            Scanner scan = new Scanner(System.in);
            int sel = scan.nextInt();
            scan.nextLine();


            if (sel == 1) {

                if(i==10){
                    System.out.println("더 이상 등록 불가");
                } else if (i < 10) {
                    System.out.print("상품 이름은?");
                    name[i] = scan.nextLine();

                    System.out.print("상품 가격은?");
                    pro[i] = scan.nextInt();
                    scan.nextLine();

                    ++i;

                }


            } else if (sel == 2) {
                for ( int j = 0 ; j <= i-1 ; j++) {
                    System.out.print("상품 이름은" + name[j]);
                    System.out.println("가격은" + pro[j]);
                }

            } else if (sel ==3) {
                break;

            } else {
                System.out.println("다시 입력 하세요");
            }
        }
    }
}
