package 백준.bronze.step4;

import java.io.*;
import java.util.StringTokenizer;

public class B25304_영수증 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int result=0;

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            array[i] = a*b;
        }

        for (int j = 0; j < N; j++) {
            result+=array[j];
        }

        if(X==result)
            bw.write("Yes");
        else
            bw.write("No");

        bw.flush();
        bw.close();
    }
}
