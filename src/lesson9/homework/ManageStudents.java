package lesson9.homework;

public class ManageStudents {
    public static void main(String[] args) {
        //Создать класс Student с полями: имя, возраст и средний балл. Реализовать 3 вида конструкторов методы: printStudentInfo() - печатает всю информацию о студенте и метод checkMark(), который проверяет больше ли у студента оценка чем 5.
        Students vova = new Students("Вовчик", 18, 5);
        vova.printStudentInfo();
        vova.checkMark();
        Students boris = new Students("Бориска", 17);
        boris.printStudentInfo();
        boris.checkMark();
        Students olga = new Students();
        olga.printStudentInfo();
        olga.checkMark();
    }
}