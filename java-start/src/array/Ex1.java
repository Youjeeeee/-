package array;

public class Ex1 {
    public static void main(String[] args) {

        int stuednts[] = {90, 80, 70, 60, 50};
        int total = 0;
        int avg;

        for (int student : stuednts) {
            total += student;
        }
        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + ((double) total/stuednts.length));
    }
}
