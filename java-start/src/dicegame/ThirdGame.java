package dicegame;

import java.util.List;

public class ThirdGame {

    List<User> userList;

    public ThirdGame(List<User> userList) {
        this.userList = userList;

        DiceThrow dice = new DiceThrow();
        for (int i = 0; i < userList.size(); i++) {


            dice.throwDice();

            //new UserScore().addsum(dice.diceNum, realUserList.get(i));
            UserScore score = new UserScore();
            score.addsum(dice.diceNum, userList.get(i));

            System.out.println(userList.get(i).name + "가 세 번째 주사위를 던집니다!");
            System.out.println(userList.get(i).name + "의 숫자는" + dice.diceNum);
            GameRule2 rule2 = new GameRule2(userList.get(i), dice.diceNum, i, userList.size());

            for (int j = 0; j < userList.size(); j++) {
                if (userList.get(i) != userList.get(j)) {
                    userList.get(j).sum -= 3;
                }
            }
            System.out.println(userList.get(i).name + "의 점수는" + userList.get(i).sum);
            System.out.println();
        }
    }
}