package bomin.goorm;

import java.util.Scanner;
import java.util.Stack;

public class B10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();  // 괄호 문자열 입력 받기

        Stack<Character> stack = new Stack<>();
        int count = 0;  // 잘린 조각 수 저장

        for (int i = 0; i < input.length(); i++) {
            char now = input.charAt(i);

            if (now == '(') {
                // 여는 괄호는 무조건 스택에 push (막대기 시작이거나 레이저 시작)
                stack.push('(');
            } else {  // 닫는 괄호인 경우
                stack.pop(); // 일단 여는 괄호 하나 제거

                if (input.charAt(i - 1) == '(') {
                    // 이전 문자가 '('라면 이건 레이저 -> 스택에 남아있는 '('는 현재 열려 있는 막대기 수
                    count += stack.size();
                } else {
                    // 이전 문자가 ')'라면 이건 막대기의 끝 → 조각 하나가 마지막에 더 생김
                    count += 1;
                }
            }
        }

        System.out.println(count);  // 총 조각 수 출력
    }
}
