package 백준.bronze.step5;

import java.io.*;
import java.util.StringTokenizer;

public class B10871_X보다작은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            array[i]=A;

            if(array[i]<X)
                bw.write(array[i]+" "+"");
        }

        bw.flush();
        bw.close();
    }
}
