package dicegame;

public class GameRule1 {
    public GameRule1() {
    }

    boolean rule1 (int diceNum){
        if (diceNum%2 ==0) {
            System.out.println("짝수! 2라운드 고고");
            return true;
        }else {
            System.out.println("루우우즈 여기까지~!");
            return false;
        }

    }

}
