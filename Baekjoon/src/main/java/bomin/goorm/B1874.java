package bomin.goorm;

import java.util.*;

public class B1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // 수열의 길이
        int[] target = new int[n];         // 목표 수열

        for (int i = 0; i < n; i++) {
            target[i] = sc.nextInt();      // 수열 입력
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int num = 1;   // 1부터 n까지 push할 숫자 인덱스
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int current = target[i];

            // 현재 수열 값까지 push
            while (num <= current) {
                stack.push(num);
                result.append("+\n");
                num++;
            }

            // pop 가능한지 확인
            if (stack.peek() == current) {
                stack.pop();
                result.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        // 출력
        if (possible) {
            System.out.print(result);
        } else {
            System.out.println("NO");
        }
    }
}
