// Abiturient: id, Прізвище, Ім'я, По батькові, Адреса, Телефон,
//        Середній бал.
//        Скласти масив об'єктів. Вивести:
//        a) список абітурієнтів із вказаним іменем;
//        b) список абітурієнтів, середній бал у яких вище заданого;
//        c) вибрати задане число n абітурієнтів, що мають найвищий
//        середній бал.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("ID | Прізвище | Ім'я | По батькові | Адрес | Номер телефону | Середній бал |\n");
        List<Abiturient> students = new ArrayList<Abiturient>();
        students.add(new Abiturient(23, "Нескорожена", "Карина", "Віталіївна", "Лукаша 2", 380660446, 4));
        students.add(new Abiturient(13, "Дикун", "Яна", "Іванівна", "Шевченка 56", 380660421, 5));
        students.add(new Abiturient(343, "Либа", "Роман", "Віталійович", "Купріяна Тутки 22", 380660446, 3));
        students.add(new Abiturient(567, "Филипчук", "Богдан", "Володимирович", "Лукаша 2", 380667846, 5));
        students.add(new Abiturient(123, "Романюк", "Марко", "Олександрович", "Франка 3", 380450446, 2));
        students.add(new Abiturient(54, "Фітьо", "Юлія", "Василівна", "Лукаша 2", 380660126, 4));
        students.add(new Abiturient(78, "Панчишина", "Карина", "Михайлівна", "Лукаша 10", 380230126, 3));

        Abiturient.infoToConsole(students);

        Abiturient.infoToConsole(Abiturient.findUserName(students));
        Abiturient.infoToConsole(Abiturient.findAverageMark(students));
        Abiturient.infoToConsole(Abiturient.findNBestStudents(students));
    }
}