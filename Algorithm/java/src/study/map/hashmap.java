package study.map;

import java.util.HashMap;
import java.util.Map;

class Person{
    String name;

    public Person(String name){
        this.name=name;
    }

    public String toString(){
        return name;
    }
}
public class hashmap {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();

        map.put("가", new Person("홍길동"));
        map.put("나", new Person("김보민"));

        Person p1 =  map.get("가");
        System.out.println("p1: "+p1);

        Person p2 = map.get("나");
        System.out.println("p2: "+p2);

        Person p3 = map.get("다");
        System.out.println("p3: "+p3);

        map.put("가", new Person("김보민"));
        Person p4 = map.get("가");
        System.out.println("p4: "+p4);

        map.remove("가");

        Person p5 = map.get("가");
        System.out.println("p5: "+p5);
    }
}
