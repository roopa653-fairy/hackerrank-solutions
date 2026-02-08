/*
Problem: Pangrams
Platform: HackerRank
Difficulty: Easy

Logic:
Remove all spaces from the string and convert it to lowercase.
Use an array of size 26 to track the presence of each alphabet letter.
Traverse the string and mark the corresponding index for each character.
If all 26 letters are present at least once, return "pangram";
otherwise return "not pangram".

Time Complexity: O(n)
Space Complexity: O(1)
*/
public static String pangrams(String s) {
    // Write your code here
        s=s.replace(" ","");
        s=s.toLowerCase();
        int []hash=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=ch-'a';//'a'-ascii value is 97;
            hash[index]++;
        }
        for(int i=0;i<26;i++){
            if(hash[i]==0){
                return "not pangram";
            }
        }
        return "pangram";
    }

}
