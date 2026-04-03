package 백준.bronze.step1;

import java.io.*;
import java.util.StringTokenizer;

public class B10951_A와B더하기4번째 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String line;

        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line, " ");
            if (line.trim().isEmpty())
                break;
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(N+M).append("\n");
        }

        bw.write(sb+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
