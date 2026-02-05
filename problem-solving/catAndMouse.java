/*
Platform: HackerRank
Difficulty: Easy

Logic:
- Calculate diff1 b/t z and x z=mouse,x=catA.
- Calculate diff2 b/t z and y z=mouse,y=catB.
- if diff1 (distance b/t mouse and catA is higher)return catB
- elseif diff1==diff2 (equal distance)return mousec;
-else return catA
Time Complexity:
- O(1)

Space Complexity:
- O(1)
*/

static String catAndMouse(int x, int y, int z) {
        int diff1=Math.abs(z-x);
        int diff2=Math.abs(z-y);
        if(diff1>diff2){
             return "Cat B";
        }
        else if(diff1==diff2){
            return "Mouse C";
        }
        else{
             return "Cat A";
        }
}
