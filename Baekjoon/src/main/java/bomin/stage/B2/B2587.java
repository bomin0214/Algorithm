package bomin.stage.B2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

//        array 인덱스 부족하여 사용 불가
//        for (int i = 0; i < 5; i++) {
//            if(arr[i]>arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }

        System.out.println(sum/5);
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}