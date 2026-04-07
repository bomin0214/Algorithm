package 백준.bronze.step4;

import java.io.*;

public class B31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        int iA = Integer.parseInt(A);
        int iB = Integer.parseInt(B);
        int add = iA+iB;
        int iC = Integer.parseInt(C);
        iC = add -iC;

        bw.write(iC+""+"\n");

        String AB = A+B;
        int result = Integer.parseInt(AB);
        int resultC = Integer.parseInt(C);
        int minus = result-resultC;

        bw.write(minus+"");

        bw.flush();
        bw.close();
    }
}
