package method;

import java.util.Scanner;

public class Method5 {
    public static void main(String[] args) {

        Method2.printheader();

        double num = 5;
        System.out.println("1. 호출전 num = " + num);
        num = changeNum((int)num);  // 명시적 형 변환 필요 큰걸 작은대로 넣을 시 반대는 그냥 가능
        System.out.println("4. 호출후 num =" + num);
    }

    public static int changeNum(int num) {
        System.out.println("2. 변경전 num" + num);
        num = num * 2;
        System.out.println("3. 변경후 num" + num);
        return num;
    }

    //오버로딩은 add라는 메서드를 여러번 정의해서 사용하는것. 단 매개변수 형식이나 타입이 달라야 함. 그럼 이름은 같아도 상관 없음

}
