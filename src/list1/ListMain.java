package list1;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        // list 생성 인터페이스기 때문에 List의 구현체를 인스턴스로 생성해야한다.
        List<String> list = new ArrayList<>();

        // 리스트 끝에 요소 추가
        list.add("A");

        // 해당 인덱스에 요소 추가
        list.add(1, "B");

        // 리스트에서 해당 요소 제거
        list.remove("A");

        // 리스트에서 해당 인덱스의 요소 제거
        list.remove(0);

        // 특정 인덱스에 있는 요소 가져오기
        String getList = list.get(0);

        // 지정된 인덱스에 값을 변경
        list.set(0, "C");

        // 리스트에 저장된 요소의 개수를 반환
        int size = list.size();

        // 리스트 초기화
        list.clear();

        // 포함여부 확인 포함이면 true를 반환
        boolean contains = list.contains("A");


        // 지정된 범위의 리스트를 반환
        List<String> subList = list.subList(0, 2);
    }
}
