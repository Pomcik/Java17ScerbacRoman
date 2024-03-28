package lesson9.homework;

public class Students {
    String name;
    int age;
    int mediumMark;

    Students() {
        name = "Ольга Петровна";
        age = 21;
        mediumMark = 2;
    }

    Students(String studentName, int studentAge, int studentMediumMark) {
        name = studentName;
        age = studentAge;
        mediumMark = studentMediumMark;
    }

    Students(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
        mediumMark = 7;
    }

    void printStudentInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Средний Балл: " + mediumMark);
    }

    void checkMark() {
        if (mediumMark > 5) {
            System.out.println("Оценка студента больше чем 5.");
            System.out.println("--------------------------------");
        } else {
            System.out.println("ценка студента меньше чем 5.");
            System.out.println("--------------------------------");
        }
    }
}
