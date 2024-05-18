package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        /*
        int coupon;

        switch (grade) {
            case 1 -> coupon = 1000;
            case 2 -> coupon = 2000;
            case 3 -> coupon = 3000;
            default -> coupon = 500;
        }
        //인트 선언후 스위치로 초기화
        */


        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
            };  //인트선언과 동시에 초기화 그래서 ; 필요

        System.out.println("쿠폰은" + coupon);
    }
}
