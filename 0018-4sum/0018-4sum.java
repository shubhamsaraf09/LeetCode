class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                    int l=n-1;
                    while(k<l){
                    // int sum=nums[i];
                    // sum+=nums[j];
                    // sum+=nums[k];
                    // sum+=nums[l];
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        List<Integer> L=new ArrayList<>();
                        L.add(nums[i]);
                        L.add(nums[j]);
                        L.add(nums[k]);
                        L.add(nums[l]);
                        list.add(L);
                        while(k<l && nums[k]==nums[k+1]) k++;
                        while(k<l && nums[l]==nums[l-1]) l--;
                        k++;
                    l--;
                    }
                    
                    }
                }
            }
            return list;
        }
        
    }
