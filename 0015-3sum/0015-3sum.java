class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<List<Integer>> set2=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k=-1*(nums[i]+nums[j]);
                        if(set.contains(k)){
                           List<Integer> l=new ArrayList<>();
                            l.add(nums[i]);
                            l.add(nums[j]);
                            l.add(k);
                            Collections.sort(l);
                            set2.add(l);
                        }
                        set.add(nums[j]);
                
            }
        }
        
            list.addAll(set2);
        
        return list;
    }
}