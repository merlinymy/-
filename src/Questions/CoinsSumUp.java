package Questions;

import java.util.List;

public class CoinsSumUp {
    void dfs(int[] coins, int leftBalance, int level, int[] oneRes, List<int[]> res) {
        //base case
        if (level == coins.length - 1) {
            oneRes[level] = leftBalance;
            res.add(oneRes.clone());
        }
        int numOfCoins = leftBalance / coins[level] + 1;//leftBalance / coinType
        for (int i = 0; i < numOfCoins; i++) {
            oneRes[level] = i;
            dfs(coins, leftBalance - i * coins[level], level + 1, oneRes, res);

        }
    }
}
