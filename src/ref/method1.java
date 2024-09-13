package ref;

public class method1 {

    public static void main(String[] args) {

        Student student1 = new Student();
        initStudent(student1, "홍길동", 20, 100);
//        student1.name = "홍길동";
//        student1.age = 20;
//        student1.grade = 100;

        Student student2 = new Student();
        initStudent(student2, "김유신", 20, 50);
//        student2.name = "김유신";
//        student2.age = 20;
//        student2.grade = 50;

//        System.out.println(student1.name + "  " + student1.age + "  " + student1.grade);
//        System.out.println(student2.name + "  " + student2.age + "  " + student2.grade);

        printStudent(student1);
        printStudent(student2);
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
