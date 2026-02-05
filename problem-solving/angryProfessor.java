/*
Platform: HackerRank
Difficulty: Easy

Logic:
- Initialize count as 0
- Traverse using for loop
- Increment count if value is less than ir equal to 0
- check is the count is greater than or equal to k return "NO"
- else return "YES"

Time Complexity:
- O(n), where n is the length of the string.

Space Complexity:
- O(1)
*/
public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
        int count=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<=0){
                count++;
            }
        }
        if(count>=k){
            return "NO";
        }
        else{
            return "YES";
        }
    }

}
