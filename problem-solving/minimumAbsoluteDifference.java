/*
Problem: Minimum Absolute Difference in an Array
Platform: HackerRank
Difficulty: Easy

Logic:
Sort the array first.
The minimum absolute difference will always be between two adjacent elements
in the sorted array.
Compare consecutive elements and keep track of the minimum difference.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/
public static int minimumAbsoluteDifference(List<Integer> arr){
// Write your code here 
Collections.sort(arr); 
int min=Integer.MAX_VALUE; 
for(int i=0;i<arr.size()-1;i++){
int diff=Math.abs(arr.get(i)-arr.get(i+1));
min=Math.min(diff,min);
} 
return min;
}
