package 백준.bronze.step2;

import java.io.*;
import java.util.StringTokenizer;

public class B1152_단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받는 새로운 한 줄
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = st.countTokens();
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}
