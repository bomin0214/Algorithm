package study.map;

import java.util.HashMap;
import java.util.Map;

public class method {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        // put
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        System.out.println("map: "+map);

        // get
        System.out.println("A값: "+map.get("A"));

        // containsKey
        System.out.println("A값 존재?: "+ map.containsKey("A"));

        // containsValue
        System.out.println("값이 40인거 존재하나?: "+map.containsValue(40));

        // size
        System.out.println("크기: "+map.size());

        // isEmpty
        System.out.println("비어있나? "+map.isEmpty());

        // keySet
        System.out.println("key 목록: "+map.keySet());

        // values
        System.out.println("value 목록: "+map.values());

        // entrySet
        System.out.println("entrySet 출력: ");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // put(덮어쓰기)
        map.put("A", 100);
        System.out.println("A 덮어쓰기 후: " +map);

        // remove
        map.remove("B");
        System.out.println("B 제거 후: "+map);

        // pullAll
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("E", 50);
        map2.put("F", 60);
        map.putAll(map2);
        System.out.println("pullAll: "+map);

        // clear
        map.clear();
        System.out.println("clear: "+map);

        // isEmpty
        System.out.println("isEmpty?: "+map.isEmpty());
    }
}

//출력
//map: {A=10, B=20, C=30, D=40}
//A값: 10
//A값 존재?: true
//값이 40인거 존재하나?: true
//크기: 4
//비어있나? false
//key 목록: [A, B, C, D]
//value 목록: [10, 20, 30, 40]
//entrySet 출력:
//A:10
//B:20
//C:30
//D:40
//A 덮어쓰기 후: {A=100, B=20, C=30, D=40}
//B 제거 후: {A=100, C=30, D=40}
//pullAll: {A=100, C=30, D=40, E=50, F=60}
//clear: {}
//isEmpty?: true
