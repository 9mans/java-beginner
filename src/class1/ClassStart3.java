package class1;

public class ClassStart3 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "홍길동";
        student1.age = 15;
        student1.grade = 30;

        Student student2 = new Student();
        student2.name = "이순신";
        student2.age = 15;
        student2.grade = 70;

        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
    }

}
