package study.sort;

import java.util.Arrays;
import java.util.Collections;

public class sort_Integer {

    static Integer[] createRandomArray(int n){
        Integer a[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random()*10);
        }

        return a;
    }
    public static void main(String[] args) {
        Integer a1[] = createRandomArray(20);

        // 오름차순
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));;

        Integer a2[] = createRandomArray(20);

        // 내림차순
        Arrays.sort(a2, Collections.reverseOrder());
        System.out.println(Arrays.toString(a2));
    }
}
