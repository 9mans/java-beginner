package stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {

        // 스택 생성
        Stack<Integer> stack = new Stack<>();

        // 데이터 추가
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // 스택 맨 위의 요소 확인 30 출력
        System.out.println("Peek: " + stack.peek());

        // 데이터 제거 반환값은 제거되는 값이 무엇인지를 반환한다.
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        // 스택이 비어있는지 확인 boolean 타입이 반환된다.
        System.out.println("is Empty: " + stack.isEmpty());
    }
}
