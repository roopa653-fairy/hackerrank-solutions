/*
Platform: HackerRank
Difficulty: Easy

Logic:
- Calculate page turns from the front using p / 2.
- Calculate total page turns using n / 2.
- Calculate page turns from the back.
- Return the minimum of front and back turns.

Time Complexity:
- O(1)

Space Complexity:
- O(1)
*/

public class DrawingBook {

    public static int pageCount(int n, int p) {

        int fromFront = p / 2;
        int totalPages = n / 2;
        int fromBack = totalPages - fromFront;

        return Math.min(fromFront, fromBack);
    }
}
