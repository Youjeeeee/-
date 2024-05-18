package loop;

public class DoWhile {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재" + i);
            i++;
        } while (i<3);  //최조 한번은 실행
    }
}
