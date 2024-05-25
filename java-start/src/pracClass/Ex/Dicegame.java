package pracClass.Ex;

public class Dicegame {
    public static void main(String[] args) {

        int player1nums[] = {0, 0, 0};
        int player2nums[] = {0, 0, 0};
        int sum1 = 0;
        int sum2 = 0;

        for (int i =0 ; i<3 ; i++) {

            Dice dice1 = new Dice();
            dice1.throwDice();
            player1nums[i] = dice1.getDiceNum();
            System.out.println("1번의 " + (i+1) + "번 주사위는 " + player1nums[i]);
            sum1 += player1nums[i];

            dice1.throwDice();
            player2nums[i] = dice1.getDiceNum();
            System.out.println("2번의 " + (i+1) + "번 주사위는 " + player2nums[i]);
            sum2 += player2nums[i];

            System.out.println();

            if (player1nums[0]%2 != 0 || player2nums[0]%2 != 0) {
                System.out.println("게임 종료");
                System.out.println("1번 점수 " + player1nums[0] + " 2번 점수 " + player2nums[0]);
                break;
            } else if (player1nums[2] == 1) {
                System.out.println("1번이 2번의 점수 3점을 뺏어 옵니다");
                sum1 += 3;
                sum2 -= 3;
                System.out.println("1번 점수 " + sum1 + " 2번 점수 " + sum2);
            } else if (player2nums[2] == 1) {
                System.out.println("2번이 1번의 점수 3점을 뺏어 옵니다");
                sum2 += 3;
                sum1 -= 3;
                System.out.println("1번 점수 " + sum1 + " 2번 점수 " + sum2);
            }else if (player1nums[2] == 3) {
                System.out.println("1번의 2점 추가점 획득");
                sum1 += 2;
                System.out.println("1번 점수 " + sum1 + " 2번 점수 " + sum2);
            }else if (player2nums[2] == 3) {
                System.out.println("2번의 2점 추가점 획득");
                sum2 += 2;
                System.out.println("1번 점수 " + sum1 + " 2번 점수 " + sum2);
            } else if (player1nums[2] == 4) {
                System.out.println("1번의 패배");
                break;
            } else if (player2nums[2] == 4) {
                System.out.println("1번의 패배");
                break;
            } else if(i==2) {
                System.out.println("게임종료!!");
                System.out.println("1번 점수 " + sum1 + " 2번 점수 " + sum2);
            }
        }
    }
}

