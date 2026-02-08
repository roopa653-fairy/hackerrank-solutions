/*
Problem: Mars Exploration
Platform: HackerRank
Difficulty: Easy

Logic:
The original message is a repetition of the pattern "SOS".
Traverse the string in steps of three characters.
For each group, compare characters with 'S', 'O', 'S'.
Count every character that differs from the expected pattern.
Return the total count of altered characters.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public static int marsExploration(String s) {
    // Write your code here
        int cnt=0;
        for(int i=0;i<s.length();i=i+3){
            if(s.charAt(i)!='S'){
                cnt++;
            }
            if(s.charAt(i+1)!='O'){
                cnt++;
            }
            if(s.charAt(i+2)!='S'){
                cnt++;
            }
        }
        return cnt;

    }
