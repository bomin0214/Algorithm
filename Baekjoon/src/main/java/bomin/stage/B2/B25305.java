package bomin.stage.B2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int arr[] =new int[N];

        //두 번째 줄을 읽기 위한 StringTokenizer
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int x = arr[N-k];

        System.out.println(x);
        br.close();
    }
}
