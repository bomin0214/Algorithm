package 백준.bronze.step4;

import java.io.*;

public class B11720_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String K = br.readLine();

        int array[] = new int[N];
        int count = 0;

        for (int i = 0; i < K.length(); i++) {
            char ch = K.charAt(i);
            array[i] = ch;
        }

        for (int i = 0; i < N; i++) {
            int a = array[i] - '0';
            count+=a;
        }


        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}
