package casting;

public class Casting4 {
    public static void main(String[] args) {

        int div1 = 3 / 2;
        System.out.println(div1);

        int div2 = 3 / 2;
        System.out.println(div2);

        double div3 = 3.0 / 2;
        System.out.println(div3);

        double div4 = (double) 3 / 2;
        System.out.println(div4);

        int a = 3;
        int b = 2;
        double result = (double)  a/b;
        System.out.println(result);
        //서로 다른 타입 계산은 큰 범위로 형변환이 자동으로 일어남
    }
}
