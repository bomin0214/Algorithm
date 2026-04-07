package 백준.bronze.step3;

import java.io.*;
import java.util.StringTokenizer;

public class B10250_ACM호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st=new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            if((N%H)==0){
                // 층 수: H
                String Y = Integer.toString(H);
                int room = N/H;
                String X = Integer.toString(room);

                if(room >=10)
                    bw.write(Y+X+"\n");
                else
                    bw.write(Y+"0"+X+"\n");
            } else{
                String Y = Integer.toString(N%H);
                int room = N/H + 1;
                String X = Integer.toString(room);

                if(room >=10){
                    bw.write(Y+X+"\n");
                } else
                    bw.write(Y+"0"+X+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
