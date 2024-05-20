package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxint = 2147483647;  //int최고값
        long maxoverint = 2147483648L;  //int최고값 +1
        int intvalue = 0;

        intvalue = (int) maxint;
        System.out.println("maxint casting = " + intvalue);

        intvalue = (int) maxoverint;
        System.out.println("maxoverint casting= " + intvalue); //문제 발생 - 가 생김 = 오버플로우 발생
    }
}
