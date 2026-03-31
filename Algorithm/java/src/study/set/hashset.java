package study.set;

import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        System.out.println(set1.size());
        System.out.println(set1.contains("a"));
        System.out.println(set1.contains("d"));

        set1.remove("a");

        Set<String> set2 = new HashSet<>(Set.of("a","b","c","d"));
        System.out.println(set2.size());

        Set<String> set3 = new HashSet<>(set1);
        set3.retainAll(set2);
        
        System.out.println(set3);
    }
}
