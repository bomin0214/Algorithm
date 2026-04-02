package 백준.bronze.step5;

import java.io.*;

public class B25314_코딩은체육과목입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int b = N/4;

        String c = "long ";

        for (int i = 0; i < b; i++) {
            bw.write(c);
        }

        bw.write("int");
        bw.flush();
        bw.close();
    }
}
