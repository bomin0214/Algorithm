package bomin.goorm;

import java.io.*;
import java.util.*;

public class B1759 {
    static int L, C;
    static char[] arr;
    static char[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken()); //길이
        C = Integer.parseInt(st.nextToken()); //문자 개수

        arr = new char[C];
        result = new char[L];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken().charAt(0);  // 문자 입력
        }

        Arrays.sort(arr); // 오름차순 정렬 필수

        dfs(0, 0, bw);  // 깊이, 시작 인덱스, 출력 버퍼 넘김

        bw.flush();
        bw.close();
        br.close();
    }

    // DFS 조합
    public static void dfs(int depth, int index, BufferedWriter bw) throws IOException {
        if (depth == L) {
            if (isValid(result)) {
                bw.write(new String(result));
                bw.newLine();
            }
            return;
        }

        for (int i = index; i < C; i++) {
            result[depth] = arr[i];
            dfs(depth + 1, i + 1, bw); // 다음 문자 선택
        }
    }

    // 모음 1개 이상 & 자음 2개 이상인지 체크
    public static boolean isValid(char[] result) {
        int mo = 0;
        int ja = 0;

        for (char c : result) {
            if ("aeiou".indexOf(c) >= 0) mo++;
            else ja++;
        }

        return mo >= 1 && ja >= 2;
    }
}
