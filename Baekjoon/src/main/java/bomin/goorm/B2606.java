package bomin.goorm;

import java.util.*;

public class B2606 {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 컴퓨터 수
        int m = sc.nextInt(); // 연결 쌍 수

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        // 그래프 초기화
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 연결 정보 입력
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a].add(b);
            graph[b].add(a); // 양방향 그래프
        }

        dfs(1); // 1번 컴퓨터부터 탐색 시작

        System.out.println(count - 1); // 1번은 제외하므로 -1
    }

    // 깊이 우선 탐색
    static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}

