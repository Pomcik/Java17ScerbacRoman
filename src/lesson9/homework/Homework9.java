package lesson9.homework;

public class Homework9 {
    public static void main(String[] args) {
        //Создать класс Student с полями: имя, возраст и средний балл. Реализовать 3 вида конструкторов методы: printStudentInfo() - печатает всю информацию о студенте и метод checkMark(), который проверяет больше ли у студента оценка чем 5.
        Student vova = new Student("Вовчик", 18, 5);
        vova.printStudentInfo();
        vova.checkMark();
        Student boris = new Student("Бориска", 17);
        boris.printStudentInfo();
        boris.checkMark();
        Student olga = new Student();
        olga.printStudentInfo();
        olga.checkMark();
        //Создать любой класс по желанию и реализовать в нем минимум 2 метода.
        Cars bmw = new Cars();
        bmw.printCarsInfo(" тыщ денег");
        Cars lincoln = new Cars("Линкольн", 2.0, 15000);
        lincoln.printCarsInfo("");
    }

    public static class Student {
        String name;
        int age;
        int mediumMark;

        public Student() {
            name = "Ольга Петровна";
            age = 21;
            mediumMark = 2;
        }

        public Student(String studentName, int studentAge, int studentMediumMark) {
            name = studentName;
            age = studentAge;
            mediumMark = studentMediumMark;
        }

        public Student(String studentName, int studentAge) {
            name = studentName;
            age = studentAge;
            mediumMark = 7;
        }

        public void printStudentInfo() {
            System.out.println("Имя: " + name);
            System.out.println("Возраст: " + age);
            System.out.println("Средний Балл: " + mediumMark);
        }

        public void checkMark() {
            if (mediumMark > 5) {
                System.out.println("Оценка студента больше чем 5.");
                System.out.println("--------------------------------");
            } else {
                System.out.println("ценка студента меньше чем 5.");
                System.out.println("--------------------------------");
            }
        }
    }

    public static class Cars {
        String carName;
        double engineSize;
        int carPrice;

        public Cars(String brand, double engine, int price) {
            carName = brand;
            engineSize = engine;
            carPrice = price;
        }

        public Cars() {
            carName = "БеМеВе";
            engineSize = 2.8;
            carPrice = 100500;
        }

        public void printCarsInfo(String test) {
            System.out.println("Марка: " + carName);
            System.out.println("Обьём двигателя: " + engineSize);
            System.out.println("Цена: " + carPrice + test);
            System.out.println("--------------------------------");
        }
    }
}