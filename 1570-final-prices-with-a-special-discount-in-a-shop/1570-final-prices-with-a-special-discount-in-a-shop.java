class Solution {
    public int[] finalPrices(int[] prices) {
        //method 1
        
        // Stack<Integer> stack=new Stack<>();
        // for(int i=0;i<prices.length;i++){
        //     while(!stack.isEmpty() && prices[i]<=prices[stack.peek()]){
        //         int index=stack.pop();
        //         prices[index]-=prices[i];
        //     }
        //     stack.push(i);
        // } 
        // return prices;

        for(int i=0;i<prices.length;i++){
           prices[i]-=fun(i,prices);

        }
        return prices;
    }
    int fun(int i,int[] arr){
        int num=arr[i];
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<=num){
                return arr[j];
            }
        }
        return 0;
    }
}