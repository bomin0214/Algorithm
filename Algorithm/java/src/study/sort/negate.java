package study.sort;

import java.util.Arrays;

public class negate {
    public static void main(String[] args) {
        int[] A = {5,4,3,2,1};
        negate(A);
        System.out.println(Arrays.toString(A));

        Arrays.sort(A);
        System.out.println(Arrays.toString(A));

        negate(A);
        System.out.println(Arrays.toString(A));
    }

    static void negate (int[] temp){
        for (int i = 0; i < temp.length; i++) {
            temp[i] *= -1;
        }
    }
}
