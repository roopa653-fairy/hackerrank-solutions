/*
Problem: Caesar Cipher
Platform: HackerRank
Difficulty: Easy

Logic:
Iterate through each character of the string.
If the character is an uppercase or lowercase letter, shift it by k positions
using modulo 26 to handle wrap-around.
Non-alphabetic characters remain unchanged.

Time Complexity: O(n)
Space Complexity: O(n)
*/
public static String caesarCipher(String s, int k) {
    // Write your code here
        int n=s.length();
        String cipher="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int temp=(int)ch;
            if(Character.isUpperCase(ch)){
                temp-=65;
                temp+=k;
                temp%=26;
                temp+=65;
            }
            else if(Character.isLowerCase(ch)){
                temp-=97;
                temp+=k;
                temp%=26;
                temp+=97;
            }
            cipher+=(char)temp;

        }
        return cipher;

    }

}
