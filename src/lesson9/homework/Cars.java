package lesson9.homework;

public class Cars {
    String carName;
    double engineSize;
    int carPrice;

    Cars(String brand, double engine, int price) {
        carName = brand;
        engineSize = engine;
        carPrice = price;
    }

    Cars() {
        carName = "БеМеВе";
        engineSize = 2.8;
        carPrice = 100500;
    }

    void printCarsInfo(String test) {
        System.out.println("Марка: " + carName);
        System.out.println("Обьём двигателя: " + engineSize);
        System.out.println("Цена: " + carPrice + test);
        System.out.println("--------------------------------");
    }
}