package 백준.gold.step3;

import java.io.*;
import java.util.StringTokenizer;

public class B10986_나머지합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //5
        int M = Integer.parseInt(st.nextToken()); //3

        long array[] = new long[N+1];
        long S[] = new long[N+1];
        long count[] = new long[M];

        st=new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            array[i]=Integer.parseInt(st.nextToken()); // 1 2 3 1 2
        }

        count[0]++;

        // 합
        for (int i = 1; i <= N; i++) {
            S[i] = S[i-1] + array[i];
            count[(int)(S[i]%M)]++; // 나머지0 -> 3개, 나머지1 -> 2개, 나머지 2-> 0개
        }

        long result=0;
        for (int i = 0; i < M; i++) {
            result += (count[i] * (count[i]-1)) / 2;
        }

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
