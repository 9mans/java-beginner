package construct;

public class MemberInitMain1 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.name = "사용자1";
        member1.age = 20;
        member1.grade = 100;

        MemberInit member2 = new MemberInit();
        member2.name = "사용자2";
        member2.age = 30;
        member2.grade = 70;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {

            System.out.println(member.name + member.age);
        }

    }
}
