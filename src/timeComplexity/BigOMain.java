package timeComplexity;

public class BigOMain {

    int[] n = {1, 2, 3, 4};

    public boolean F(int[] n) {

        // 입력데이터의 크기에 따라 시간도 증가하는 경우 오--엔
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    // 입력데이터의 크기 상관 없이 언제나 일정한 시간이 걸리는 경우 오--원
        return (n[0] == 0)? true:false;
    }


    public void F1(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; i++) {
                System.out.println(n[i] + n[j]);
            }
        }
    }



}
