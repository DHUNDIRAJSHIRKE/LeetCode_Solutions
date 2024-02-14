package q_3000_MaximumAreaOfLongestDiagonalRectangle;

/*
You are given a 2D 0-indexed integer array dimensions.

For all indices i, 0 <= i < dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] represents the width of the rectangle i.

Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.
*/

/*
Constraints:

1 <= dimensions.length <= 100
dimensions[i].length == 2
1 <= dimensions[i][0], dimensions[i][1] <= 100
*/


class Solution {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double maxDia = 0;
        double diagonal;
        for(int i = 0; i<dimensions.length;i++){
            diagonal = Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]);
            if(diagonal==maxDia){
                if(maxArea<dimensions[i][0] * dimensions[i][1]){
                    maxArea = dimensions[i][0] * dimensions[i][1];
                }
            }else if(diagonal>maxDia){
                maxDia = diagonal;
                maxArea = dimensions[i][0] * dimensions[i][1];
            }
        }
        return maxArea;
    }
}