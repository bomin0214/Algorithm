package 백준.bronze.step5;

import java.io.*;
import java.util.StringTokenizer;

public class B11022_A와B더하기8번째 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N+1; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A+B;
            bw.write("Case #"+ i +": " + A + " + " + B + " = " + sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
