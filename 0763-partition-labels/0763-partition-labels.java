class Solution {
    public List<Integer> partitionLabels(String s) {
        Set<Character> set = new HashSet<>();
        
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
            arr[(int)(s.charAt(i)-'a')]=i;
        }

        List<Integer> ans = new ArrayList<>();

        int st=0,e=0;

        for(int i=0;i<s.length();i++){
            e=Math.max(e,arr[s.charAt(i) - 'a']);
            if(i == e){
                ans.add(i-st+1);
                st=i+1;
            }
        }
        return ans;
    }
}

