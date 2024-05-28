package dicegame;

import java.util.List;
import java.util.Scanner;

public class Dicegamemain {

    public static void main(String[] args) {

        //유저 생성
        System.out.println("몇명이서 할래?");
        Scanner scan = new Scanner(System.in);

        UserList userList = new UserList();
        List<User> realUserList = userList.generatorUserList(scan.nextInt());
        scan.nextLine();

        //첫번째 게임
        new FirstGame(realUserList);


        //두번째 게임
        new SecondGame(realUserList);

        //세번째 게임
        new ThirdGame(realUserList);




    }
}
