package bomin.goorm;


import java.util.*;

public class B1926 {
    static int N, M;
    static int[][] paper;
    static boolean[][] visited;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        paper = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                paper[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        int maxArea = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (paper[i][j] == 1 && !visited[i][j]) {
                    int area = bfs(i, j);
                    count++;
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(count);
        System.out.println(maxArea);
    }

    public static int bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        visited[y][x] = true;

        int area = 1;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int cy = now[0];
            int cx = now[1];

            for (int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                if (ny >= 0 && ny < N && nx >= 0 && nx < M) {
                    if (paper[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        queue.add(new int[]{ny, nx});
                        area++;
                    }
                }
            }
        }

        return area;
    }
}
