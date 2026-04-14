package 백준.silver.step1;

import java.io.*;
import java.util.StringTokenizer;

public class B11660_구간합구하기5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 크기 N, 4
        int M = Integer.parseInt(st.nextToken()); // 합 구하기, 3

        int array[][] = new int[N+1][N+1];
        int S[][] = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) { // array[x][y] 값 넣기
            st=new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
               array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // S[i][j]
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                S[i][j] = S[i][j-1]+S[i-1][j]-S[i-1][j-1]+array[i][j];
            }
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine()); // 2 2 3 4
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = S[x2][y2]-S[x1-1][y2]-S[x2][y1-1]+S[x1-1][y1-1];
            bw.write(result+""+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
