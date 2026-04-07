package 백준.bronze.step3;

import java.io.*;

public class B2562_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int array[] = new int[9];

        for (int i = 0; i < 9; i++) {
            int N = Integer.parseInt(br.readLine());
            array[i]=N;
        }

        int maximum = 0;

        for (int i = 0; i < 9; i++) {
            if(array[i] > maximum){
                maximum = array[i];
            }
        }

        int num = 0;

        for (int i = 0; i <9 ; i++) {
            if(array[i]==maximum)
                num=i+1;
        }

        bw.write(maximum+""+"\n");
        bw.write(num+"");
        bw.flush();
        bw.close();
    }
}
