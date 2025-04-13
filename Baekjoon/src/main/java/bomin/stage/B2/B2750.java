package bomin.stage.B2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //숫자
        int array[] = new int[n]; //배열에 그 크기만큼 생성

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine()); //배열에 입력 받음. int형으로 변환
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        br.close();
        //bw.flush(), bw.close();
    }
}
