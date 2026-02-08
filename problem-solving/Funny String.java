/*
Problem: Funny String
Platform: HackerRank
Difficulty: Easy

Logic:
Create a reversed version of the given string.
For each index, calculate the absolute difference between adjacent characters
in the original string and the reversed string.
If all corresponding differences are equal, the string is Funny.
If any mismatch occurs, the string is Not Funny.

Time Complexity: O(n)
Space Complexity: O(n)
*/
public static String funnyString(String s) {
    // Write your code here
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        int n=s.length(),flag=1;
        for(int i=0;i<n-1;i++){
            int temp1=Math.abs(s.charAt(i)-s.charAt(i+1));
            int temp2=Math.abs(rev.charAt(i)-rev.charAt(i+1));
            
            if(temp1!=temp2){
                flag=0;
                break;
            }
        }
        if(flag==1){
            return "Funny";
        }
        return "Not Funny";
    }
