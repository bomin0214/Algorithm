package bomin;

import java.util.Scanner;

public class hw10_2 {
    static int n; // 정점 수
    static int[][] matrix; // 인접행렬
    static int[] visited; // hw10_2에서 상태를 확장하기 위해 boolean 배열로 하지 말고 int 배열로 - 방문하지 않았으면 0, 방문했으면 1(상수를 지정해도 됨)
    static boolean hasCycle = false; // 사이클 존재 여부

    public static void main(String[] args) {
        System.out.println("hw10_2:김보민");
        Scanner scanner = new Scanner(System.in);

        // (1) 방향그래프의 정점수 n을 입력받음
        n = scanner.nextInt();

        // (2) 인접행렬을 생성하고 인접행렬 내용을 입력받아 채움
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // (3) 그래프를 깊이우선탐색하여 순서대로 정점 번호 출력
        visited = new int[n];

        // (4) 모든 정점에 대해 DFS 수행 (방문하지 않은 정점만)
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i);
                if (hasCycle) break; // 사이클이 발견되면 더 이상 탐색하지 않음
            }
        }

        // (5) 결과 출력
        if (hasCycle) {
            System.out.println("사이클이 존재하므로 DAG가 아닙니다.");
        } else {
            System.out.println("DAG입니다.");
        }
    }

    // 깊이우선탐택
    static void dfs(int node) {
        visited[node] = 1; // 방문 중으로 표시

        for (int next = 0; next < n; next++) {
            if (matrix[node][next] == 1) { // 간선이 있는 경우
                if (visited[next] == 0) {
                    dfs(next); // 다음 정점 방문
                    if (hasCycle) return; // 재귀 중 사이클 발견 시 종료
                } else if (visited[next] == 1) {
                    // 이미 방문 중인 정점을 다시 방문하면 사이클 존재
                    hasCycle = true;
                    return;
                }
            }
        }

        visited[node] = 2; // 방문 완료
    }
}
