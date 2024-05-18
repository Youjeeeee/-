package cond;

public class Ex3 {
    public static void main(String[] args) {
        int dollar = 5;
        int won = 1300;

        if (dollar < 0) {
            System.out.println("잘못된 금액");
        } else if (dollar == 0){
            System.out.println("환전할 금액이 없음");
        } else{
            won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원 입니다.");
        }
    }
}
