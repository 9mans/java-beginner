package class1;

public class ClassStart4 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "홍길동";
        student1.age = 15;
        student1.grade = 30;

        Student student2 = new Student();
        student2.name = "이순신";
        student2.age = 15;
        student2.grade = 70;

//      Student[] students = new Student[2];
        Student[] students = {student1, student2};


        students[0] = student1;
        students[1] = student2;

        for (int i = 0; i < students.length; i++) {

            System.out.println(students[i].name + " " + students[i].age + " " + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.name + " " + s.age + " " + s.grade);
        }

        // iter 향상된 for문 단축문
        for (Student s : students) {
            System.out.println(s.name + " " + s.age + " " + s.grade);
        }
    }

}
