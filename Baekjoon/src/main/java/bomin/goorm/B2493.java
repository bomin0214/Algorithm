package bomin.goorm;

import java.util.*;
import java.io.*;

public class B2493 {
    static class Tower {
        int index;
        int height;

        Tower(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] heights = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Tower> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int currentHeight = heights[i];

            // 이전 탑들 중에서 현재보다 낮은 탑은 제거
            while (!stack.isEmpty() && stack.peek().height < currentHeight) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                sb.append("0 ");
            } else {
                sb.append(stack.peek().index).append(" ");
            }

            stack.push(new Tower(i + 1, currentHeight)); // 현재 탑 저장 (1-based index)
        }

        System.out.println(sb.toString().trim());
    }
}
