package lesson7.homework;

import java.util.Arrays;

public class HomeworkArrayContest {
    public static void main(String[] args) {
        //1
        filterIntArray(new int[20]);
        //2
        filterStringArray(new String[5]);
        //3
        powerIntArray(new int[5]);
        //4
        checkWord(new String[]{"First", "Second", "Third"}, "sEcOnD");
    }

    // 1. Дан массив целых чисел. Вернуть массив только четных чисел.
    public static int[] filterIntArray(int[] array) {
        for (int i = 0, index = 0; i < array.length * 2; i++) {
            if (i % 2 == 0) {
                array[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------------");
        return null;
    }

    // 2. Дан массив строк. Вернуть массив строк содержащих букву a.
    public static String[] filterStringArray(String[] array) {
        array[0] = Arrays.toString(new String[]{"Первая строка"});
        array[1] = Arrays.toString(new String[]{"Тут её нет"});
        array[2] = Arrays.toString(new String[]{"А тут есть, но..."});
        array[3] = Arrays.toString(new String[]{"И тут нет"});
        array[4] = Arrays.toString(new String[]{"А тут снова есть"});
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("а")) {
                System.out.println(array[i]);
            }
        }
        System.out.println("---------------------------------------");
        return null;
    }

    // 3. Дан массив целых чисел. Вернуть массив квадратов этих чисел.
    public static int[] powerIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int[] array2 = new int[]{(i * i)};
            System.out.println(Arrays.toString(array2));
        }
        System.out.println("---------------------------------------");
        return null;
    }

    // 4. Дан массив строк. Проверить содержится ли слово в массиве, игнорируя case.
    public static boolean checkWord(String[] array, String word) {
        boolean wordFound = false;
        for (String str : array) {
            if (str.equalsIgnoreCase(word)) {
                wordFound = true;
                break;
            }
        }
        if (wordFound) {
            System.out.println("Слово '" + word + "' было найдено");
        } else {
            System.out.println("Слово '" + word + "' не было найдено");
        }
        System.out.println("---------------------------------------");
        return true;
    }

    // 5. Дана матрица целых чисел. Вернуть строку в матрице с наибольшей суммой элементов.
    public static int[] biggestRowInMatrix(int[][] matrix) {
        return null;
    }
}