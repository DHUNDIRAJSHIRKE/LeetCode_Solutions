package q_2849_DetermineIfACellIsReachableAtAGivenTime;

/*
You are given four integers sx, sy, fx, fy, and a non-negative integer t.

In an infinite 2D grid, you start at the cell (sx, sy). Each second, you must move to any of its adjacent cells.

Return true if you can reach cell (fx, fy) after exactly t seconds, or false otherwise.

A cell's adjacent cells are the 8 cells around it that share at least one corner with it. You can visit the same cell several times.
*/

/*
Constraints:

1 <= sx, sy, fx, fy <= 109
0 <= t <= 109
*/

class Solution {
    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int x= sx-fx;
        int y = sy-fy;
        if(x<0){
            x*=-1;
        }
        if(y<0){
            y*=-1;
        }
        int time = 0;
        if(x==0 && y==0){
            if(t==1){
                return false;
            }
        }
        if(x==y){
            time = x;
        }else if(x<y){
            time += x;
            time += (y-x);
        }else{
            time += y;
            time +=(x-y);
        }
        if(t>=time){
            return true;
        }else{
            return false;
        }
    }
}
