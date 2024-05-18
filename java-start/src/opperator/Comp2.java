package opperator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";


        boolean resulte1 = "hello".equals("hello"); //리터럴 비교
        boolean resulte2 = str1.equals("문자열1"); //문자열 변수, 리터럴 비교
        boolean resulte3 = str1.equals(str2);  //문자열 변수 비교

        System.out.println(resulte1);
        System.out.println(resulte2);
        System.out.println(resulte3);
    }
}
