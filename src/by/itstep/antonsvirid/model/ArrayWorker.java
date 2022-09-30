package by.itstep.antonsvirid.model;

public class ArrayWorker {
    public static boolean checkValue(int[] array, int value) {

        for (int item : array) {        // алгоритм поиска значения в массиве (есть/нет?)
            if (item == value) {
                return true;
            }
        }
        return false;
    }

    public static int findFirstIndexValue(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastIndexValue(int[] array, int value){
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int countValue(int[] array, int value) {
        int count = 0;

        for (int element : array) {
            if (element == value) {
                count++;
            }
        }

        return count;
    }
}
