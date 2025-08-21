class Solution {
    public int romanToInt(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int nums1=0;
        int nums2=0;
        int i=0;
        int ans=0;
        for(i=0;i<s.length()-1;i++){
            nums1=map.get(s.charAt(i));
            nums2=map.get(s.charAt(i+1));
            if(nums1<nums2){
                ans-=nums1;
            }
            else ans+=nums1;
        }
        ans+=nums2;
        if(ans==0) ans+=map.get(s.charAt(0));
        return ans;
    }
}