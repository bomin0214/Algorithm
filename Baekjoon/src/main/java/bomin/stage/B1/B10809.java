package bomin.stage.B1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(arr[ch - 'a'] == -1)
                arr[ch - 'a'] = i;
        }

        for(int sout : arr)
            System.out.print(sout + " ");
    }
}