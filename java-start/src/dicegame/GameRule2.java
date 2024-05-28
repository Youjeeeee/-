package dicegame;

import java.util.List;

public class GameRule2 {

    List<User> userList;

    public GameRule2(User user, int dicenum, int i, int k) {

        if (dicenum == 1 && k > 1) {

            System.out.println("플레이어 수는 " + k);
            System.out.println("규칙에 의해" + user.name + "이 " + (k-1) + "명의 다른 플레이어로 부터 3점을 뺏어 옵니다.");
            user.sum += (3 * (k - 1));
        } else if(dicenum == 1 && k <= 1){
            System.out.println("주사위가 1이지만 다른 플레이어가 없어 점수를 뺏지 못합니다.");
        }
    }
}







