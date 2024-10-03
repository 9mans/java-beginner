package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // 데이터 추가
        queue.offer(10);
        queue.add(20);
        queue.offer(30);

        // 큐 맨 앞 요소 확인 10출력
        System.out.println("Peek: " + queue.peek());

        // 데이터 제거 10 출력, 20 출력 데이터가 제거되고 제거된 데이터의 값이 반환된다.
        System.out.println("Poll: " + queue.poll());
        System.out.println("remove: " + queue.remove());

        // 비어있는지 확인
        System.out.println("is Empty: " + queue.isEmpty());

    }
}
