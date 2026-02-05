/*
Platform: HackerRank
Difficulty: Easy

Logic:
- Iterate through all keyboard and drive price combinations.
- Calculate the sum of each pair.
- If the sum is within budget, update the maximum spent.
- Return the maximum possible sum or -1 if no valid pair exists.

Time Complexity:
- O(n × m)

Space Complexity:
- O(1)
*/

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max = -1;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sum = keyboards[i] + drives[j];

                if (sum <= b) {
                    max = Math.max(max, sum);
                }
            }
        }

        return max;
    }
}
