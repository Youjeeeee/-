package cond;

public class Ex2 {
    public static void main(String[] args) {
        int dis = 1;
        if (dis > 100) {
            System.out.println("거리는" + dis + "비행기이용");
        } else if (dis > 10) {
            System.out.println("거리는" + dis + "자동차이용");
        } else if (dis > 1) {
            System.out.println("거리는" + dis + "자전거이용");
        } else {
            System.out.println("거리는" + dis + "도보");
        }
    }
}
