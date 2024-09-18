package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;


    MemberConstruct(String name, int age, int grade) {

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(String name, int age) {
        // 첫번째 줄에서만 this 사용가능 
        this(name, age, 50);
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }


}
