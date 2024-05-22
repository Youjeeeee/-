package array;

//배열은 사이즈를 동적으로 변경가능. 반복적인 과정을 줄일 수 있는 이점을 가짐
public class Arraay4 {
    public static void main(String[] args) {

        int[] students = new int[]{90, 80 ,70 ,60, 50, 40, 30};


        for (int i= 0 ; i < 7 ; i++) {
            System.out.println("학생" + (i + 1 ) + "점수 :" + students[i]);
        }
    }
}
