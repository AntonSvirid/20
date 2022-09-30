package by.itstep.antonsvirid.controller;

import by.itstep.antonsvirid.model.ArrayWorker;

public class Main {
    public static void main(String[] args) {

        int size = 1_000_000;
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        ArrayWorker.checkValue(array, 2_000_000);
        ArrayWorker.binarySearch(array, 2_000_000);
    }

    //       int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};  // объявление и инициализация массива


//        for (int item : array) {    // - foreach - перебор элементов массива, присваивание элементам
    //   переменной item
//            item *= 2;                // что нужно сдлеать с очередным элементом
//        }
//
//        for (int item : array) {
//            System.out.println(item + " ");
//        }

    // System.out.println(array); - не работает, массив - ссылочная переменная
}

