package method;

public class Method1 {
    public static void main(String[] args) {

        int sum1 = add(15, 20);
        System.out.println(sum1);

    }


    //add 매서드
    public static  int add(int a, int b){
        System.out.println( a + "+" + b + "연산 수행");
        int sum = a +b ;
        return  sum;
    }
}
