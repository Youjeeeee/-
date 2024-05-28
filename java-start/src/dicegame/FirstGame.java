package dicegame;

import java.util.List;

public class FirstGame {



        List<User> userList;
        public FirstGame(List<User> userList) {
            this.userList = userList;


            DiceThrow dice = new DiceThrow();
            for (int i = 0; i < userList.size(); i++) {

                dice.throwDice();

                //new UserScore().addsum(dice.diceNum, realUserList.get(i));
                UserScore score = new UserScore();
                score.addsum(dice.diceNum, userList.get(i));

                System.out.println(userList.get(i).name + "가 주사위를 던집니다!");
                System.out.println(userList.get(i).name + "의 점수는" + userList.get(i).sum);

                GameRule1 rule1 = new GameRule1();
                if (rule1.rule1(userList.get(i).sum) == false) {
                    System.out.println(userList.get(i).name + "은 탈락!");
                    System.out.println();
                    userList.remove(i);
                    i -= 1;
                } else {
                    System.out.println("다시 던져 보자구~");
                    System.out.println();
                }


            }
        }
}
