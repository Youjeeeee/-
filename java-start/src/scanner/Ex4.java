package scanner;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scane = new Scanner(System.in);

        int sum = 0;

        while (true){

        System.out.println("1:상품입력, 2:결제 3:종료 원하는 옵션 숫자는?");

        int option = scane.nextInt();

        if (option < 1 && option > 3) {
            System.out.println("다시 입력하세요");
        } else if (option ==1 ) {
            // SCANNER 하면 만약 1을 입력했으면 실제로 입력되는 값은 1 + "/n"
            // 근데 option은 nextint 1밖에 안받음 그래서 "/n"이 메모리에 남아있음
            // 이걸로 "/n"을 빼줘야 됨

            scane.nextLine();

            System.out.print("상품명 :");
            String name = scane.nextLine();

            System.out.print("가격 :");
            int price = scane.nextInt();

            System.out.print("수량은 ?");
            int num = scane.nextInt();

            sum = sum + price * num;

            System.out.print("상품명 :" + name + "가격" + price + "수량" + num + "합계 :" + price*num);

        } else if (option == 2) {
            System.out.println("총금액 :" + sum);
            sum = 0;

        } else if (option == 3) {
            break;

        }

        }
        }
}
