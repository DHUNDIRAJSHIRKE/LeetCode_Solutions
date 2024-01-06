package q_788_RotatedDigits;

class Solution {
    public static int rotatedDigits(int n) {
        int count= 0;
        for(int i =1;i<=n;i++){
            if(isGood(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isGood(int n){

    	String str = ""+n;
        char[] digits = str.toCharArray();
        for( char digit : digits){
            if(digit == '4' || digit == '7' || digit=='3' ){
            	
                return false;
            }
        }
        boolean reverse = false;
        for(char digit : digits){
            
            if(!(digit=='1' || digit=='0' || digit=='8' )){
            	
                reverse = true;
                break;
            }
        }
        if(!reverse){
            return false;
        }

        return true;
    }
}