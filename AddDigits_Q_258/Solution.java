package AddDigits_Q_258;

class Solution {
    public int addDigits(int num) {
        int sum = 0;
        if(num<10){
            return num;
        }
        else{
            int number = num;
            
            while(number!=0){
                sum = sum + number%10;
                number = number/10;
            }
            if(sum>=10){
                return addDigits(sum);
            }
            if(sum<10){
                return sum;
            }
        }
        return sum;
    }
}
