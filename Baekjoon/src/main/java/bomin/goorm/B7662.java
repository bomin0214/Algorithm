package bomin.goorm;

import java.io.*;
import java.util.*;

public class B7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());  // 테스트 케이스 수

        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());  // 연산 수
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int i = 0; i < k; i++) {
                String[] cmd = br.readLine().split(" ");
                String op = cmd[0];
                int val = Integer.parseInt(cmd[1]);

                if (op.equals("I")) {
                    // 삽입
                    map.put(val, map.getOrDefault(val, 0) + 1);
                } else {
                    // 삭제
                    if (map.isEmpty()) continue;

                    int key = (val == 1) ? map.lastKey() : map.firstKey();

                    if (map.get(key) == 1) {
                        map.remove(key);
                    } else {
                        map.put(key, map.get(key) - 1);
                    }
                }
            }

            if (map.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(map.lastKey() + " " + map.firstKey());
            }
        }
    }
}