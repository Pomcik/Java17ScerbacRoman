package lesson6.homework;

public class Homework6Arrays {
    public static void main(String[] args) {
        //Создать метод, который сохраняет в массиве все нечетные числа и после этого печатает все элементы в одной строке от 0 до 100
        array1();
    }

    public static void array1() {
        int[] array = new int[50];
        int index = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                array[index] = i;
                index++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}