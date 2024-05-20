package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intvalue = 10;
        long longvalue;
        double doublevalue;

        longvalue = intvalue; //int -> long
        System.out.println("longvalue =" + longvalue);

        doublevalue = intvalue; //int -> double
        System.out.println("doublevalue =" + doublevalue);

        doublevalue = 20L; //long -> double
        System.out.println("doublevalue2= " + doublevalue);
        //작은범위를 큰 범위로 대입은 문제 없음 자동 형변환 일어남
    }
}
