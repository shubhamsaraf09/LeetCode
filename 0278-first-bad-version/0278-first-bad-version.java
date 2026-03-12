/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1) return 1;
        int s=0;
        int e=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isBadVersion(mid)==true) {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}