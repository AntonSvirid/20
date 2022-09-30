package by.itstep.antonsvirid.model;

public class ArrayWorker {
    public static boolean checkValue(int[] array, int value) {

        int count = 0;  //debug - доразобрать почемуне работает!!!

        for (int item : array) {

        return true;
        }


        for (int item : array) {
            count++;    // алгоритм поиска значения в массиве (есть/нет?)
            if (item == value) {
                return true;
            }
        }
        System.out.println("count = " + count);
        return false;
    }

    public static int findFirstIndexValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastIndexValue(int[] array, int value) {
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

    public static boolean binarySearch(int[] array, int value) {
        int count = 0;  //debug
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            count++;

            int middle = (right + left) / 2;

            if (value == array[middle]) {
                System.out.println("count = " + count);
                return true;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        System.out.println("count = " + count);
        return false;
    }
}
