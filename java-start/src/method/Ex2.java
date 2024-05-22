package method;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        int money = 0;

        while (true) {
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액");
            System.out.println("4. 종료");
            Scanner scan = new Scanner(System.in);
            int sel = scan.nextInt();
            scan.nextLine();

            if (sel == 1) {
                System.out.println("입금 액은?");
                int a = scan.nextInt();
                scan.nextLine();
                money += a;
                System.out.println("현재 잔액 : " + money);
            }
            else if ( sel ==2 ){
                System.out.println("출금 액은?");
                int a = scan.nextInt();
                scan.nextLine();
                money -= a;
                System.out.println("현재 잔액 : " + money);
            }
            else if ( sel ==3 ) {
                System.out.println("현재잔액 : " + money);

            } else if (sel == 4) {
                break;

            } else {
                System.out.println("다시 입력하세요");
            }

        }

        }
    }

