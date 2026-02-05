/*
Platform: HackerRank
Difficulty: Easy

Logic:
- Calculate primary diagonal sum where i == j.
- Calculate secondary diagonal sum from top-right to bottom-left.
- Return absolute difference of both sums.

Time Complexity:
- O(n^2)

Space Complexity:
- O(1)
*/

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int size = arr.size();
        int sum1 = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sum1 += arr.get(i).get(j);
                }
            }
        }

        int i = 0, j = size - 1;
        int sum2 = 0;

        while (i < size && j >= 0) {
            sum2 += arr.get(i).get(j);
            i++;
            j--;
        }

        return Math.abs(sum1 - sum2);
    }
}
