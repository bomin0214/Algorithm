package 프로그래머스.step1;

import java.util.*;

public class P68644_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        P68644_두개뽑아서더하기 p = new P68644_두개뽑아서더하기();
        int[] numbers = {2, 1, 3, 4, 1};
        int[] result = p.solution(numbers);
        System.out.println(Arrays.toString(result));
    }
}
