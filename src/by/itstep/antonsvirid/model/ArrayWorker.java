package by.itstep.antonsvirid.model;

public class ArrayWorker {
    public static boolean checkValue(int[] array, int value) {
        boolean result = false;

        for (int item : array) {        // алгоритм поиска значения в массиве (есть/нет?)
            if (item == value) {
                result = true;
                break;
            }
        }
        
        return result;
    }
}
