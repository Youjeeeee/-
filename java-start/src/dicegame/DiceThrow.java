package dicegame;

class DiceThrow {
    public DiceThrow() {
    }

    int diceNum;

    int getDiceNum() {
        return diceNum;
    }

    void throwDice(){

        diceNum = (int) (Math.random() * 6) + 1;
    }
}