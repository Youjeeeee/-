package dicegame;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    List<User>userList = new ArrayList<>();

    public UserList() {
    }

    List<User> generatorUserList (int i){
        for (int j = 0; j < i; j++) {
            User user = new User();   //인스턴스화
            user.name = "player" + (j+1);
            userList.add(user);

            System.out.println(userList.get(j).name+ "이 게임을 준비합니다.");
        }
        System.out.println();


        return userList;
    }


}
