class Solution {
    public int[] decrypt(int[] code, int k) {
        int l=0,r=0;
        int arr[]=new int[code.length];
        if(k==0){
         
            Arrays.fill(arr,0);
            return arr;
        }
        else if(k>0){
        
        for(int i=0;i<code.length;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                if((i+j+1)<arr.length){
                sum+=code[i+j+1];
                }else{
                    sum+=code[i+j+1-arr.length];
                }
            }
            arr[i]=sum;
        }
        }
        else{
            k=k*-1;
            for(int i=0;i<code.length;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                if((i-j-1)>=0){
                sum+=code[i-j-1];
                }else{
                    sum+=code[i-j-1+arr.length];
                }
            }
            arr[i]=sum;
        }
        }
        return arr;
    }
}