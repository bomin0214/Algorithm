package bomin;

import java.util.Scanner;

public class Main_202314007 {
    static int n; // 정점 수
    static int[][] matrix; // 인접행렬
    static int[] visited; // 방문 여부 저장 배열: 0 = 방문 안 함, 1 = 방문함
    static boolean hasCycle = false; // 사이클 존재 여부 저장 변수

    public static void main(String[] args) {
        System.out.println("hw10_3:김보민");
        Scanner sc = new Scanner(System.in);

        // 정점 수 입력
        n = sc.nextInt();

        // 인접행렬 입력
        matrix = new int[n][n]; // n x n 행렬 생성
        for (int i = 0; i < n; i++) { // 각 행
            for (int j = 0; j < n; j++) { // 각 열
                matrix[i][j] = sc.nextInt(); // 간선 유무 입력
            }
        }

        // 방문 배열 초기화
        visited = new int[n]; // 0으로 초기화됨

        // 각 정점에 대해 DFS 수행
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i, -1); // 시작 정점 i, 이전 정점 없음 (-1)
                if (hasCycle) break; // 사이클 발견되면 더 이상 검사하지 않음
            }
        }

        // 결과 출력
        if (hasCycle) {
            System.out.println("사이클이 존재합니다.");
        } else {
            System.out.println("사이클이 존재하지 않습니다.");
        }
    }

    // DFS 탐색 함수: 현재 정점 current, 이전 정점 parent
    static void dfs(int current, int parent) {
        visited[current] = 1; // 현재 정점 방문 표시

        // 인접한 모든 정점 검사
        for (int next = 0; next < n; next++) {
            if (matrix[current][next] == 1) { // 간선이 존재하는 경우
                if (visited[next] == 0) {
                    dfs(next, current); // 다음 정점 방문
                    if (hasCycle) return; // 재귀 중 사이클 발견 시 종료
                } else if (next != parent) {
                    // 방문한 정점인데 부모 정점이 아니라면 사이클
                    hasCycle = true;
                    return;
                }
            }
        }
    }
}