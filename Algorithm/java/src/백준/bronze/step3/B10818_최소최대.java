package 백준.bronze.step3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10818_최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int array[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(st.nextToken());
            array[i] = X;
        }

        Arrays.sort(array);

        bw.write(array[0] + " " + array[N-1]);
        bw.flush();
        bw.close();
    }
}
