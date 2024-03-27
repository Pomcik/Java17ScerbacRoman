package lesson7.homework;

import java.util.Arrays;

public class HomeworkArrayContest {
    public static void main(String[] args) {
        //1
        int[] firstTest = new int[]{1, 2, 3, 4, 0, -1, 8, 22, 2, 1};
        System.out.println(Arrays.toString(filterIntArray(firstTest)));
        System.out.println("---------------------------------------");
        //2
        String[] secondTest = new String[]{"Первая строка", "Тут её нет", "А тут есть, но...", "И тут нет", "А тут сновj есть"};
        System.out.println(Arrays.toString(filterStringArray(secondTest)));
        System.out.println("---------------------------------------");
        //3
        int[] thirdTest = new int[]{1, 2, 5, -2, 0, 4, 999};
        System.out.println(Arrays.toString(powerIntArray(thirdTest)));
        System.out.println("---------------------------------------");
        //4
        String word = "sEcOnD";
        if (checkWord(new String[]{"First", "Second", "Third"}, word)) {
            System.out.println("Слово '" + word + "' было найдено");
        } else {
            System.out.println("Слово '" + word + "' не было найдено");
        }
        System.out.println("---------------------------------------");
    }

    // 1. Дан массив целых чисел. Вернуть массив только четных чисел.
    public static int[] filterIntArray(int[] array) {
        int index = 0;
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                resultArray[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOfRange(resultArray, 0, index);
    }

    // 2. Дан массив строк. Вернуть массив строк содержащих букву a.
    public static String[] filterStringArray(String[] array) {
        int index = 0;
        String[] resultArray = new String[array.length];
        for (String s : array) {
            if (s.contains("а")) {
                resultArray[index] = s;
                index++;
            }
        }
        return Arrays.copyOfRange(resultArray, 0, index);
    }

    // 3. Дан массив целых чисел. Вернуть массив квадратов этих чисел.
    public static int[] powerIntArray(int[] array) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i] * array[i];
        }
        return resultArray;
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
        return wordFound;
    }

//    // 5. Дана матрица целых чисел. Вернуть строку в матрице с наибольшей суммой элементов.
//    public static int[] biggestRowInMatrix(int[][] matrix) {
//        return null;
//    }
}