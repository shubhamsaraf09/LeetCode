class Solution {
    public int minCost(String s, int[] n) {
        int time=0;
        int j=0;
        for(int i=1;i<n.length;i++){
            if(s.charAt(i)==s.charAt(j)){
            if(n[i]<n[j]) time+=n[i];
            else time+=n[j];
            if (n[i] > n[j]) j= i;
            }
          else  j=i;
        }

        return time;
    }
}