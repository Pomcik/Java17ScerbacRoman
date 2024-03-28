package lesson9.homework;

public class ManageCars {
    public static void main(String[] args) {
        //Создать любой класс по желанию и реализовать в нем минимум 2 метода.
        Cars bmw = new Cars();
        bmw.printCarsInfo(" тыщ денег");
        Cars lincoln = new Cars("Линкольн", 2.0, 15000);
        lincoln.printCarsInfo("");
    }
}
