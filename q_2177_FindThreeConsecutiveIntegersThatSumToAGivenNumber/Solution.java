package q_2177_FindThreeConsecutiveIntegersThatSumToAGivenNumber;
class Solution {
    public long[] sumOfThree(long num) {
        long[] x = new long[0];
        if(num==0){
            long[] y = {-1,0,1};
            return y;
        }
        if(num<3){
            return x;
        }
        long sum = 0;
        long temp = num;
        while(temp!=0){
            sum += temp %10;
            temp/=10;
        }
        long[] ret = new long[3];
        if(sum%3==0){
            
            ret[1] = num/3;
            ret[0] = ret[1]-1;
            ret[2] = ret[1]+1;
            return ret;
        }else{
            return x;
        }
    }
}