package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int dis = 0;

        if (price >= 10000) {
            dis = dis + 1000;
            System.out.println("10000원 이상구매, 1000원 할인");
        } else if (age <= 10) {
            dis = dis + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("할인 금액: " + dis + "원");
    }
}
