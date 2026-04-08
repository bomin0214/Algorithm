package 백준.bronze.step2;

import java.io.*;

public class B2577_숫자의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String result1 = String.valueOf(result);

        int array[] = new int[result1.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = result1.charAt(i) - '0' ;
        }

        int k = 0;

        for (int i = 0; i < 10; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if(array[j] == i){
                    count++;
                }
            }
            bw.write(count+"\n"+"");

            k = array.length-i;
        }

        for (int j = 0; j < k; j++) {
            bw.write("0"+""+"\n");
        }

        bw.flush();
        bw.close();
    }
}
