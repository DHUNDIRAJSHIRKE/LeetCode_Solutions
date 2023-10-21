    class Solution {
        public boolean canWinNim(int n) {
            if(n<4){
                return true;
            }
            if(n%4==0){
                return false;
            }
            else{
                if(n%4==1){
                    return true;
                }
                if(n%4 > 1 && n%4 < 4){
                return true;

            }
            }
            return false;
        }
    }
