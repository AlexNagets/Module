package com.moduleTask;

public class CheckHorsePosition {
    public static boolean checkHorsePosition(int startPositionX, int startPositionY, int testPositionX, int testPositionY) {

        if (startPositionX * startPositionY < 64 && testPositionX * testPositionY < 64) {
            if (testPositionX == startPositionX - 2 && testPositionY == startPositionY + 1) return true;
            if (testPositionX == startPositionX - 1 && testPositionY == startPositionY + 2) return true;
            if (testPositionX == startPositionX + 1 && testPositionY == startPositionY + 2) return true;
            if (testPositionX == startPositionX + 2 && testPositionY == startPositionY + 1) return true;
            if (testPositionX == startPositionX + 2 && testPositionY == startPositionY - 1) return true;
            if (testPositionX == startPositionX + 1 && testPositionY == startPositionY - 2) return true;
            if (testPositionX == startPositionX - 1 && testPositionY == startPositionY - 2) return true;
            if (testPositionX == startPositionX - 2 && testPositionY == startPositionY - 1) return true;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkHorsePosition(4, 4, 3,7));
    }

}
