/*
Problem: sherlock and arrays
Platform: HackerRank
Difficulty: Easy

Logic:
First calculate the total sum of the array and store it as right sum.
Initialize left sum as 0.
Traverse the array and for each element:
- Subtract the current element from right sum.
- If left sum equals right sum, a balanced index is found.
- Otherwise, add the current element to left sum and continue.
If any balanced index exists, return "YES"; otherwise return "NO".

Time Complexity: O(n)
Space Complexity: O(1)
*/
public static String balancedSums(List<Integer> arr) {
    // Write your code here
        int lsum=0,rsum=0;
        int flag=0;
        for(int i=0;i<arr.size();i++){
            rsum+=arr.get(i);
        }
        for(int j=0;j<arr.size();j++){
            rsum-=arr.get(j);
            if(rsum==lsum){
                flag=1;
                break;
            }
            lsum+=arr.get(j);
        }
        
        if(flag==1){
            return "YES";
        }
        else{
            return "NO";
        }
     }
