package construct;

public class MemberThis {

    String nameFiled;

    // 이름이 다르면 가까운 변수를 찾는데 문제가 발생하지 않는다.
    void initMember(String nameParameter) {
        nameFiled = nameParameter;
    }
}
