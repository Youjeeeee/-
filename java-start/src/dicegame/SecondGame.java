package dicegame;

import java.util.List;

public class SecondGame {

    List<User> userList;
    public SecondGame(List<User> userList) {
        this.userList = userList;

        DiceThrow dice = new DiceThrow();
        for (int i = 0; i < userList.size(); i++) {


            dice.throwDice();

            //new UserScore().addsum(dice.diceNum, realUserList.get(i));
            UserScore score = new UserScore();
            score.addsum(dice.diceNum, userList.get(i));

            System.out.println(userList.get(i).name + "가 두 번째 주사위를 던집니다!");
            System.out.println(userList.get(i).name + "의 숫자는" + dice.diceNum);
            System.out.println(userList.get(i).name + "의 점수는" + userList.get(i).sum);
            System.out.println();

        }


    }
}
