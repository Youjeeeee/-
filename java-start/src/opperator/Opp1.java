package opperator;

public class Opp1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        //덧셈
        int sum = a + b;
        System.out.println("a + b =" + sum);

        //뺄셈
        int diff = a - b;
        System.out.println("a - b =" + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b =" + multi);

        //나눗셈
        int div = 5 / 2; //정수형이라 2가 출력
        System.out.println("a / b =" +div);

        //나머지
        int mod = a % b;
        System.out.println("a % b =" + mod);

    }
}
