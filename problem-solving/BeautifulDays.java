/*
Platform: HackerRank
Difficulty: Easy

Logic:
- Iterate from i to j.
- Reverse each number.
- Check if the absolute difference between the number and its reverse
  is divisible by k.
- Count such numbers as beautiful days.

Time Complexity:
- O(n × d)

Space Complexity:
- O(1)
*/

public class BeautifulDays {

    public static int beautifulDays(int i, int j, int k) {

        int count = 0;

        for (int u = i; u <= j; u++) {
            int n = u;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = rev * 10 + r;
                n = n / 10;
            }

            if (Math.abs(u - rev) % k == 0) {
                count++;
            }
        }

        return count;
    }
}
