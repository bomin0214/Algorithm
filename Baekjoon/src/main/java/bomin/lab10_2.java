package bomin;

import java.util.Scanner;

public class lab10_2 {
    static int n; // 정점의 개수
    static int[][] matrix; // 인접행렬
    static int[] visited; // 방문 여부
    static int[] stack; // 위상정렬 결과 저장용 스택
    static int top; // 스택 인덱스

    public static void main(String[] args) {
        System.out.println("lab10_2:김보민");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); // 정점 수 입력
        matrix = new int[n][n]; // 인접행렬 초기화
        visited = new int[n]; // 방문 배열 초기화
        stack = new int[n]; // 결과 저장할 스택
        top = n - 1; // 스택 인덱스는 n-1부터 시작

        // 인접행렬 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // 모든 정점에 대해 DFS 수행
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }

        // 스택에 쌓인 정점들을 순서대로 출력 (위상 정렬 결과)
        for (int i = 0; i < n; i++) {
            System.out.print(stack[i] + " ");
        }
    }

    // DFS를 수행하면서 후위 순회 방식으로 스택에 정점 저장
    static void dfs(int v) {
        visited[v] = 1; // 방문 표시
        for (int i = 0; i < n; i++) {
            if (matrix[v][i] == 1 && visited[i] == 0) {
                dfs(i); // 방문하지 않은 인접 정점 DFS
            }
        }
        stack[top--] = v; // 모든 인접 정점 처리 후 스택에 저장
    }
}
