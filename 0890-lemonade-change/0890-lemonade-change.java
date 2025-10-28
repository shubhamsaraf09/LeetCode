class Solution {
    int c5=0;
    int c10=0;
    public boolean lemonadeChange(int[] bills) {
        for(int n: bills){
            if(!valid(n)) return false;
        }
        return true;
    }
    boolean valid(int n){
        if(n==5) {
            c5++;
            return true;
        }
        if(n==10) {
            c10++;
            if(c5>0) {
                c5--;
                return true;
            }
        }
        if(n==20){
            if(c10>0 && c5>0) {
                c10--;
                c5--;
                return true;
            }
            else if(c5>=3){
                c5-=3;
                return true;
            }
        }
        return false;
    }
}