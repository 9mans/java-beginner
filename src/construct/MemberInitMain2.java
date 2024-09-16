package construct;

public class MemberInitMain2 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        initMember(member1, "사용자1", 20, 100);
//        member1.name = "사용자1";
//        member1.age = 20;
//        member1.grade = 100;

        MemberInit member2 = new MemberInit();
        initMember(member2, "사용자2", 30, 70);
//        member2.name = "사용자2";
//        member2.age = 30;
//        member2.grade = 70;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {

            System.out.println(member.name + member.age);
        }

    }
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
