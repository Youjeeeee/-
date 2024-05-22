package method;

public class Ex1 {
    public static void main(String[] args) {
        int a= 1;
        int b= 2;
        int c= 3;

        int sum = sumMothod(a,b,c);
        double avg = avg(sum);

        System.out.println(sum + " " + avg);
    }

    public static int sumMothod(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
    public static double avg(int sum){
        double avg = sum/3;
        return avg;
    }
}
