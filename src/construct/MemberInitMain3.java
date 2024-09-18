package construct;

public class MemberInitMain3 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.initMember("사용자1", 30, 50);
//        initMember(member1, "사용자1", 20, 100);
//        member1.name = "사용자1";
//        member1.age = 20;
//        member1.grade = 100;

        MemberInit member2 = new MemberInit();
        member2.initMember("사용자2", 30, 100);
//        initMember(member2, "사용자2", 30, 70);
//        member2.name = "사용자2";
//        member2.age = 30;
//        member2.grade = 70;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {

            System.out.println(member.name + member.age);
        }

    }
}
