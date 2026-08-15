class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        int[] arr= new int[26];
        int i=0;int j=0;int len=0;
        while(i<s.length() && j<s.length()){
            while(arr[s.charAt(j)-'a']>=2){
                arr[s.charAt(i)-'a']--;
                i++;
            }
            arr[s.charAt(j)-'a']++;
            len=j-i+1;

            j++;
            max=Math.max(max,len);
        }
        return max;
    }
}