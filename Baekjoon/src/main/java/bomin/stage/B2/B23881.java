package bomin.stage.B2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B23881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()); //배열의 크기
        int K = Integer.parseInt(br.readLine()); //교환 횟수
        int number = Integer.parseInt(br.readLine());
        int arr[] = new int[A];

        int max = 0;

        for (int i = 0; i < A; i++) {

        }
        for (int i = 0; i < A; i++) {
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
            }
        }

        //max일때, 뒤에랑 바꿔주겠어.
        for (int i = 0; i < A; i++) {
            if(max==arr[i]){
                int swap = arr[i];
                arr[i] = arr[A-1];
                arr[A-1] = swap;

                //바꿔주고 나서 배열 크기 줄어듦

            }
        }
    }
}