/*
Platform: HackerRank
Difficulty: Easy

Logic:
- Initialize count as 1 for the first word.
- Traverse the string character by character.
- Increment count whenever an uppercase letter is found.
- Return the total word count.

Time Complexity:
- O(n)

Space Complexity:
- O(1)
*/

public class CamelCase {

    public static int camelcase(String s) {

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
