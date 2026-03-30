package silver.step4;

import java.io.*;
import java.util.*;

public class B1920_수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(bufferedReader.readLine());
        st = new StringTokenizer(bufferedReader.readLine());
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt((st.nextToken())));
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        st = new StringTokenizer(bufferedReader.readLine());
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = Integer.parseInt(st.nextToken());

            if(set.contains(a[i])){
                bufferedWriter.write("1\n");
            }
            else
                bufferedWriter.write("0\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
