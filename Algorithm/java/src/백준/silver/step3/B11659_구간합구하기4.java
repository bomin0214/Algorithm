package 백준.silver.step3;

import java.io.*;
import java.util.StringTokenizer;

public class B11659_구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()); // 5 3
        int N = Integer.parseInt(st.nextToken()); // 5
        int M = Integer.parseInt(st.nextToken()); // 3

        int S[] = new int[N+1];

        st = new StringTokenizer(br.readLine()); // 5 4 3 2 1
        for (int i = 1; i <= N; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            bw.write(S[two]-S[one-1]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
