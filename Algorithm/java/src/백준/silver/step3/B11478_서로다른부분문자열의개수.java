package 백준.silver.step3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class B11478_서로다른부분문자열의개수 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();

        String S = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = 1; j < S.length()+1; j++) {
                if(i<j)
                    set.add(S.substring(i, j));
            }
        }
        bw.write(set.size()+"");

        bw.flush();
        bw.close();
    }
}

// substring(4) -> 4부터 가져오기
// substring(6, 12) -> 6~11
// write(set.size()) -> 크기
