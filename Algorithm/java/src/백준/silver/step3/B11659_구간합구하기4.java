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

        int array[] = new int[N];
        st = new StringTokenizer(br.readLine()); // 5 4 3 2 1
        for (int i = 0; i < array.length; i++) {
            int arr = Integer.parseInt(st.nextToken());
            array[i]=arr; // 배열에 넣고
        }

        int S[] = new int[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            for (int j = one-1; j < two; j++) {
                S[i] += array[j];
            }
            bw.write(S[i]+"\n"+"");
        }
        bw.flush();
        bw.close();
    }
}
