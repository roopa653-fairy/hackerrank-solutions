/*
Problem: Equalize the Array
Platform: HackerRank
Difficulty: Easy

Logic:
- Count the frequency of each element using a HashMap
- Find the maximum frequency
- Minimum deletions = total elements - maximum frequency

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class EqualizeArray {

    public static int equalizeArray(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find maximum frequency
        int maxfreq = 0;
        for (int freq : map.values()) {
            maxfreq = Math.max(maxfreq, freq);
        }

        // Return minimum deletions
        return arr.size() - maxfreq;
    }
}
