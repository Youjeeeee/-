package pracClass.Ex;

public class DiceEx1 {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        dice1.throwDice();
        dice2.throwDice();

        System.out.print("첫번째주사위 : ");
        System.out.println(dice1.getDiceNum());

        System.out.print("두번째주사위 : ");
        System.out.println(dice2.getDiceNum());

        Hamonizer hamo = new Hamonizer();
        double t = hamo.hamo(dice1.getDiceNum(), dice2.getDiceNum());

        if (t == 0) {
            System.out.println("승리");
        } else {
            System.out.println("패배");
        }


    }
}

class Dice {
    int diceNum;

    public Dice() {
    }

    int getDiceNum() {
        return diceNum;
    }

    void throwDice(){

        diceNum = (int) (Math.random() * 6) + 1;
    }


}
class Hamonizer {
    public Hamonizer() {
    }

    double hamo(int num1, int num2){
        return  (num2+num1) % 4;
    }

}
