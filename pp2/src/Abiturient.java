import java.util.*;

public class Abiturient {
    int id;
    String surname;
    String username;
    String parent_name;
    String address;
    long phone;
    Integer avg_mark;

    public Integer getAvg_mark() {
        return avg_mark;
    }

    public void setAvg_mark(Integer avg_mark) {
        this.avg_mark = avg_mark;
    }

    Abiturient(int id, String surname, String username, String parent_name, String address, long phone, Integer avg_mark) {
        this.id = id;
        this.surname = surname;
        this.username = username;
        this.parent_name = parent_name;
        this.address = address;
        this.phone = phone;
        this.avg_mark = avg_mark;
    }

    public String toString() {
        return id + " " + surname + " " + username + " " + parent_name + " (" + address + ") " + phone + " [" + avg_mark + "] ";
    }

    /** function to get info in console
     * @param students: List<Abiturient>
     * */
    public static void infoToConsole (List<Abiturient> students) {
        for (Abiturient student : students) {
            System.out.println(student);
        }
    }


    /** function to find students by name
     * @param students: List<Abiturient>
     * @return selectedStudents: List<Abiturient>
     * */
    public static List<Abiturient> findUserName(List<Abiturient> students) {
        System.out.println("\nВведіть ім'я: ");
        Scanner name = new Scanner(System.in);
        String selectedname = name.nextLine();
        List<Abiturient> selectedStudents = new ArrayList<Abiturient>();

        for (Abiturient student : students) {
            if (Objects.equals(selectedname, student.username)) {
                selectedStudents.add(student);
            }
        }

        return selectedStudents;
    }


    /** function to find average mark
     * @param students: List<Abiturient>
     * @return selectedStudents: List<Abiturient>
     * */
    public static List<Abiturient> findAverageMark(List<Abiturient> students) {
        System.out.println("\nВведіть оцінку:");
        Scanner mark = new Scanner(System.in);
        int num = mark.nextInt();

        List<Abiturient> selectedStudents = new ArrayList<Abiturient>();

        for (Abiturient student : students) {
            if (student.avg_mark > num) {
                selectedStudents.add(student);
            }
        }

        return selectedStudents;
    }


    /** function to find N best students
     * @param students: List<Abiturient>
     * @return selectedStudents: List<Abiturient>
     * */
    public static List<Abiturient> findNBestStudents(List<Abiturient> students){
        System.out.println("\nВведіть кількість найкращих студентів:");
        Scanner mark = new Scanner(System.in);
        int num = mark.nextInt();

        List<Abiturient> selectedStudents = new ArrayList<Abiturient>();

        Collections.sort(students, new Comparator<Abiturient>(){
            public int compare(Abiturient e1, Abiturient e2){
                return e2.getAvg_mark().compareTo(e1.getAvg_mark());
            }
        });
        for (int i = 0; i < num; i++) {
            selectedStudents.add(students.get(i));
        }

        return selectedStudents;
    }
}