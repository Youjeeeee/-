package cond;

import java.net.Inet4Address;
import java.util.Arrays;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:  //break 없어서 3으로 넘어가서 출력
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("쿠폰은" + coupon);
    }
}
