class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        // Stack<Integer> stack=new Stack<>();
        // int count=0;
        // for(int a : arr){
        //     while(!stack.isEmpty() && stack.peek()>a){
        //         stack.pop();
        //         count++;
        //     }
        //     stack.push(a);
        // }
        // return count;
        int n=arr.length;
        int left=0;
        while(left<n-1 && arr[left]<=arr[left+1]){
            left++;
        }
        if(n-1==left) return 0;
        int right=n-1;
        while(right>0 && arr[right]>=arr[right-1]){
            right--;
        }
        int result=Math.min(n-1-left,right);
        int i=0,j=right;
        while(i<=left && j<n){
            if(arr[i]<=arr[j]){
                result=Math.min(j-i-1,result);
                i++;
            }else{
                j++;
            }
        }
            return result;

    }
}