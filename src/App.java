import model.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("joyce", 22, "female", 1);
        System.out.println("name" + student.getName());
        System.out.println("age" + student.getAge());
        System.out.println("gender" + student.getGender());
        System.out.println("id" + student.getId());
    }
}
