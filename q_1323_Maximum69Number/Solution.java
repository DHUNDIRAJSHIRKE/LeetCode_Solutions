package q_1323_Maximum69Number;

class Solution {
    public static int maximum69Number (int num) {
        String number = ""+num;
        char[] n = number.toCharArray();
        for(int i = 0 ; i<n.length;i++){
            if(n[i]=='6'){
                n[i]='9';
                break;
            }
        }
        String ret = String.copyValueOf(n);
        int returnable = Integer.parseInt(ret);
        return returnable;
    }
}