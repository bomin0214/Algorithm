package 백준.bronze.step2;

import java.io.*;

public class B2577_숫자의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String result = String.valueOf(val);
        int array[] = new int[result.length()];

        for (int i = 0; i < array.length; i++) {
            array[(result.charAt(i) - '0')]++;
        }

        for (int v : array)
            bw.write(v+""+"\n");
        bw.flush();
        bw.close();
    }
}
