package bomin.goorm;

import java.util.Scanner;

public class B1987 {
    static int R, C;
    static char[][] board;
    static boolean[] visited = new boolean[26]; // 알파벳 방문 여부
    static int max = 0;

    // 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void dfs(int x, int y, int depth) {
        max = Math.max(max, depth);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위 안이고, 아직 방문하지 않은 알파벳이면
            if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
                char nextChar = board[nx][ny];
                int index = nextChar - 'A';
                if (!visited[index]) {
                    visited[index] = true;
                    dfs(nx, ny, depth + 1);
                    visited[index] = false; // 백트래킹
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine(); // 줄바꿈 처리

        board = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            board[i] = line.toCharArray();
        }

        // 시작 위치 알파벳 방문 처리
        visited[board[0][0] - 'A'] = true;
        dfs(0, 0, 1);

        System.out.println(max);
    }
}
