/*
Problem: Utopian Tree
Platform: HackerRank
Difficulty: Easy

Logic:
The tree starts with a height of 1.
For every growth cycle:
- During spring (even cycle index), the height doubles.
- During summer (odd cycle index), the height increases by 1.
Repeat this process for n cycles and return the final height.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Result {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
    // Write your code here
        int height=1;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                height=height+1;
            }
            else{
                height=height*2;
            }
            
        }
        return height;
    }

}
