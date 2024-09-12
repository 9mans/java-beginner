package class1;

public class ClassStart1 {

    public static void main(String[] args) {

        String[] students = {"길동", "순신"};
        int[] ages = {16, 15};
        int[] grade = {50, 70};

        for (int i = 0; i < students.length; i++) {

            System.out.println("이름 : " + students[i] + " 나이: " + ages[i] + " 성적: " + grade[i]);
        }
    }
}
