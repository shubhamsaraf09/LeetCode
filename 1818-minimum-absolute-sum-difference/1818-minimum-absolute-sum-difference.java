class Solution {
    int mod=1000000007;
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int[] arr=nums1.clone();
        Arrays.sort(arr);
        int diff=0;
        int max=0;
        long sum=0;
        for(int i=0;i<nums1.length;i++){
            int n=nums1[i]-nums2[i];
            sum+=Math.abs(n);
            diff=search(arr,nums2[i]);
            max=Math.max(max,Math.abs(n)-Math.abs((diff-nums2[i])));
        }

        return (int)((sum-max)%mod);
    }
    int search(int[] arr,int  target){
        int s=0;
        int e=arr.length-1;
        if(target>arr[e]) return arr[e];
        while(s<=e){
            int m=(s+e)/2;
            if(arr[m]==target) return arr[m];
            else if(arr[m]>target) e=m-1;
            else s=m+1;
        }
        if(s==0) return arr[s];
        if (Math.abs(arr[s] - target) <
    Math.abs(arr[s - 1] - target)) {
    return arr[s];
}

return arr[s - 1];
    }
}