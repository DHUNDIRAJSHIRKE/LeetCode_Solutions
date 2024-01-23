package q_2481_MinimumCutsToDivideACircle;

class Solution {
    public static int numberOfCuts(int n) {
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return n/2;
        }else{
            return n;
        }
    }
}
