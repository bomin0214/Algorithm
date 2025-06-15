package bomin.goorm;
import java.util.*;

public class B7576 {
    static int[][] box;
    static boolean[][] visited;
    static int N, M;
    static Queue<int[]> queue = new LinkedList<>();

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();

        box = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        bfs();

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                result = Math.max(result, box[i][j]);
            }
        }

        System.out.println(result - 1); // 시작값이 1이었으므로 -1
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int y = now[0];
            int x = now[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (box[ny][nx] == 0 && !visited[ny][nx]) {
                        queue.add(new int[]{ny, nx});
                        visited[ny][nx] = true;
                        box[ny][nx] = box[y][x] + 1;
                    }
                }
            }
        }
    }
}
