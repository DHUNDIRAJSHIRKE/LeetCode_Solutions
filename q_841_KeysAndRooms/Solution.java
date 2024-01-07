package q_841_KeysAndRooms;

import java.util.List;


/*
There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. 
Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of distinct keys in it. 
Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array rooms where rooms[i] is the set of keys that you can obtain
 if you visited room i, return true if you can visit all the rooms, or false otherwise.
 
 
 Constraints:

n == rooms.length
2 <= n <= 1000
0 <= rooms[i].length <= 1000
1 <= sum(rooms[i].length) <= 3000
0 <= rooms[i][j] < n
All the values of rooms[i] are unique.
 
*/
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> keys = rooms.get(0);
        List<Integer> temp ;
        int val ;
        for(int i=0;i<keys.size();i++){
            temp = rooms.get(keys.get(i));
            for(int j= 0;j<temp.size();j++){
                val = temp.get(j);
                if(!keys.contains(val)){
                    keys.add(val);
                }
            }
        }
        for(int i=1;i<rooms.size();i++){
            if(!keys.contains(i)){
                return false;
            }
        }
        return true;
    }
}
