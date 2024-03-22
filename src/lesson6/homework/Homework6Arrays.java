package lesson6.homework;

import java.util.Arrays;

public class Homework6Arrays {
    public static void main(String[] args) {
        //Создать метод, который сохраняет в массиве все нечетные числа и после этого печатает все элементы в одной строке от 0 до 100
        array1();
    }

    public static void array1() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                int[] array = {i};
                System.out.print(Arrays.toString(array));
            }
        }
    }
}