class Solution {

    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        for(int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            long ans=1;
            for(int j=0;j<=i;j++){
                list.add((int)ans);
                ans=ans*(i-j)/(j+1);
                            }
            res.add(list);
        }
        return res;
    }
    // long f(int num){
    //     if(num<2) return 1;
    //     long ans=1;
    //     for(int i=2;i<=num;i++){
    //         ans*=i;
    //     }
    //     return ans;
    // }
}