package study.sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_String {

    static ArrayList<String> createRandomList(int n){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(String.valueOf((int)(Math.random()*10)));
        }

        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<String> a1 = createRandomList(20);
        Collections.sort(a1);

        ArrayList<String> a2 = createRandomList(20);
        Collections.sort(a2, Collections.reverseOrder());
        System.out.println(a2);
    }
}
