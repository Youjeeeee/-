package casting;

public class Casting2 {
    public static void main(String[] args) {

        double doublevalue = 1.5;
        int intvalue = 0;

        //intvalue = doublevalue;  는 컴파일 오류 발생
        intvalue = (int) doublevalue; //명시적 형변환
        System.out.println(intvalue);  //손실 변환 doublevalue안의 값은 바뀐게 아님
    }
}
