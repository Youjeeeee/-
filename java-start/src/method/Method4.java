package method;

public class Method4 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. 호출전 num = " + num);
        num = changeNum(num);
        System.out.println("4. 호출후 num =" + num);
    }

    public static int changeNum(int num) {
        System.out.println("2. 변경전 num" + num);
        num = num * 2;
        System.out.println("3. 변경후 num" + num);
        return num;
    }

}
