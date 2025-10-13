class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Integer,Integer> map=new HashMap<>(128);
     for(int i=0;i<129;i++){
        map.put(i,-1);
     }   
    int n=s.length();
    int maxlen=0;
    int l=0,r=0,len=0;
    while(r<n){
        if(map.get((int)s.charAt(r))!=-1){
            if(map.get((int)s.charAt(r))>=l){
                l=map.get((int)s.charAt(r))+1;
            }
        }
        len=r-l+1;
        maxlen=Math.max(maxlen,len);
        map.put((int)s.charAt(r),r);
        r++;
    }
    return maxlen;
    }
}