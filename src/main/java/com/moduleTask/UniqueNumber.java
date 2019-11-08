package com.moduleTask;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] array = {15, 12, 19, 1, 1, 1, 9, 3, 234, 42};
        System.out.println("Unique number in array:" + uniqueNumberInArray(array));
    }

    public static int uniqueNumberInArray(int[] array) {
        int counter;
        int uniqueNumber;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return uniqueNumber = countUnique - count;
    }
}
