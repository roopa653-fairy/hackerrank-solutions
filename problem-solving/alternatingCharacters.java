/*
Problem: Alternating Characters
Platform: HackerRank
Difficulty: Easy

Logic:
Traverse the string and compare each character with the next one.
If two adjacent characters are the same, one deletion is required.
Count such occurrences to determine the minimum number of deletions
needed to make the string alternating.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public static int alternatingCharacters(String s) {
    // Write your code here
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        return count;

    }
