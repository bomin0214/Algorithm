package 백준.bronze.step1;

import java.io.*;
import java.util.StringTokenizer;

public class B1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 3
        int array[] = new int[N];
        st = new StringTokenizer(br.readLine()); // 40 80 60
        for (int i = 0; i < array.length; i++) {
            int answer = Integer.parseInt(st.nextToken());
            array[i] = answer; // 배열에 점수 저장
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
            sum += array[i];
        }

        bw.write(sum*100.0/max/N+""); // double
        bw.flush();
        bw.close();
    }
}
