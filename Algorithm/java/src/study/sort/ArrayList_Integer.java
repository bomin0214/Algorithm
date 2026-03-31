package study.sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Integer {

    static ArrayList<Integer> createRandomList(int n){
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arraylist.add((int)(Math.random()*10));
        }
        return arraylist;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a1 = createRandomList(20);

        // 컬렉션 정렬은 이렇게.
        Collections.sort(a1);
        System.out.println(a1);

        ArrayList<Integer> a2 = createRandomList(20);
        Collections.sort(a2, Collections.reverseOrder());
        System.out.println(a2);
    }
}
