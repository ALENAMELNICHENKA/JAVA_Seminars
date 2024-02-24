/*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1. */


public class Task_2 {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 0, 1, 1, 1 };

        int maxCount = getRepeatOnes(arr);
        System.out.println(maxCount);

    }

    private static int getRepeatOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxCount = maxCount < count ? count : maxCount; //тернарный оператор
                // if (maxCount < count) {
                //     maxCount = count;
                // }
            } else {
                count = 0;
            }

        }
        return maxCount;
    }

}
