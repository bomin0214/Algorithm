package 백준.silver.step4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B10816_숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Map<Integer,Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // a의 중복 세기
        for(int key:a){
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int b[] = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] =Integer.parseInt(st.nextToken());

            if(map.get(b[i]) == null){
                bw.write("0 ");
                continue;
            }
            bw.write(map.get(b[i])+" ");
        }
        bw.flush();
        bw.close();
    }
}
