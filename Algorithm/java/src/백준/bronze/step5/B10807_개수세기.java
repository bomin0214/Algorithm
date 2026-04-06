package 백준.bronze.step5;

import java.io.*;
import java.util.StringTokenizer;

public class B10807_개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int array[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            array[i] = a;
        }

        int v = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            if(array[i]==v)
                count++;
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}
