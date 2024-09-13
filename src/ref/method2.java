package ref;

public class method2 {

    public static void main(String[] args) {

        Student student1 = new Student();
        initStudent(student1, "홍길동", 20, 100);

        Student student2 = new Student();
        initStudent(student2, "김유신", 20, 50);

        Student student3 = createStudent("이순신", 20, 100);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    static Student createStudent(String name, int age, int grade) {

        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void initStudent(Student student, String name, int age, int grade) {

        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println(student.name + "  " + student.age + "  " + student.grade);
    }
}
