package bronze.step5;

import java.io.*;
import java.util.StringTokenizer;

public class B1000_덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = a+b;
        bw.write(String.valueOf(sum)); // bw.write는 int 사용 못 하므로, String으로 바꿔준다.
        bw.flush(); // 버퍼 비우기 (출력)
        bw.close(); // 버퍼 닫기
    }
}
