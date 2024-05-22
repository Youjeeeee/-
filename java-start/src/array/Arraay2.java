package array;

//배열은 사이즈를 동적으로 변경가능. 반복적인 과정을 줄일 수 있는 이점을 가짐
public class Arraay2 {
    public static void main(String[] args) {

        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i= 0 ; i < 5 ; i++) {
            System.out.println("학생" + (i + 1 ) + "점수 :" + students[i]);
        }
    }
}
