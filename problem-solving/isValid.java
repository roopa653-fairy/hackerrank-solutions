/*
Problem: Caesar Cipher
Platform: HackerRank
Difficulty: Easy

Logic:
Traverse the string character by character.
For each letter, convert it to its alphabetical index, add the shift value k,
apply modulo 26 to handle rotation, and convert it back to a character.
Uppercase and lowercase letters are handled separately.

Time Complexity: O(n)
Space Complexity: O(n)
*/
public static String isValid(String s) {
    // Write your code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
    int [] arr=new int[map.size()];
        int idx=0;
        for(Map.Entry<Character,Integer>CharacterIntegerentry:map.entrySet()){
            arr[idx++]=CharacterIntegerentry.getValue();
            
        }
        Arrays.sort(arr);
        if(map.size()==1)
            return "YES";
        int first=arr[0];
        int second=arr[1];
        int secondlast=arr[arr.length-2];
        int last=arr[arr.length-1];
        if(first==last) return "YES";
        if(first==1 && second==last) return "YES";
         if(first==second && second==secondlast && secondlast==(last-1)) return "YES";
        return "NO";
    }

}

}
