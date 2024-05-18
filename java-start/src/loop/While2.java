package loop;

public class While2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        while (count < 10) {
            sum = sum + count;
            ++count;
            System.out.println("현재 합" + sum);
        }
    }
}
