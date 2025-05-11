package bomin.goorm;

import java.io.*;
import java.util.*;

public class B17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] result = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장

        for (int i = 0; i < n; i++) {
            // 오큰수를 찾는 과정
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        // 스택에 남은 인덱스는 오큰수가 없는 경우
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

