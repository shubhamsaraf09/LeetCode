class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
    
        int s=1,e=piles[piles.length-1];
        int ans=e;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(check(piles,mid,h)){
                ans=mid;
                e=mid-1;
            }
            
            else s=mid+1;
        }
        return ans;
    }
    boolean check(int[] arr,int n,int h){
        long count = 0;
        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            count+=k/n;
            if(k%n!=0) count++;
        }
        return count<=h;
    }
}