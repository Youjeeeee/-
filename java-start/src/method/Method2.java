package method;

public class Method2 {
    public static void main(String[] args) {
        printheader();
        System.out.println("프로그램이 동작중");
        printfooter();
    }

    public static void printheader(){
        System.out.println("프로그램 시작");
        return;
    }

    public static void printfooter(){
        System.out.println("프로그램 종료");
        return;
    }
}
