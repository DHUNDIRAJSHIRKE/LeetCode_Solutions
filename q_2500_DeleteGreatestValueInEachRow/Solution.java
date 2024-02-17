package q_2500_DeleteGreatestValueInEachRow;

import java.util.Arrays;


/*
You are given an m x n matrix grid consisting of positive integers.

Perform the following operation until grid becomes empty:

Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
Add the maximum of deleted elements to the answer.
Note that the number of columns decreases by one after each operation.

Return the answer after performing the operations described above.

*/

/*
Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 50
1 <= grid[i][j] <= 100
*/

class Solution {
    public static int deleteGreatestValue(int[][] grid) {
        for(int[] arr : grid){
            Arrays.sort(arr);
        }
        int sum =0;
        int max = 0;
        int l =grid[0].length;
        for(int i =l-1;i>=0;i--){
            for(int j =0;j<grid.length;j++){
                if(max<grid[j][i]){
                    max = grid[j][i];
                }
            }
            l--;
            sum+=max;
            max =0;
        }
        return sum;
    }
}
