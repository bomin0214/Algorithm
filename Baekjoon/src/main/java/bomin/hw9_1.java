package bomin;

import java.util.*;

public class hw9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(); // 목표 금액
        int n = scanner.nextInt(); // 동전 종류 수
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        int[] dp = new int[m + 1];
        int[] lastCoin = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        Arrays.fill(lastCoin, -1);
        dp[0] = 0; // 금액 0을 만드는 최소 동전 수는 0

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                int coin = coins[j];
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    if (dp[i] > dp[i - coin] + 1) {
                        dp[i] = dp[i - coin] + 1;
                        lastCoin[i] = coin;
                    }
                }
            }
        }

        if (dp[m] == Integer.MAX_VALUE) {
            System.out.println("해 없음");
        } else {
            System.out.println(dp[m]);
            Map<Integer, Integer> coinCount = new TreeMap<>();
            int temp = m;
            while (temp > 0) {
                int coin = lastCoin[temp];
                coinCount.put(coin, coinCount.getOrDefault(coin, 0) + 1);
                temp -= coin;
            }

            for (int coin : coinCount.keySet()) {
                System.out.println(coin + " x " + coinCount.get(coin) + "개");
            }
        }

        scanner.close();
    }
}
