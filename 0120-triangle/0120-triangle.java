class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int[][] arr=new int[triangle.size()][];
        for(int i=0;i<triangle.size();i++){
            arr[i]=new int[triangle.get(i).size()];
            // Arrays.fill(arr[i],-1);
        }
        return tri(triangle,arr,triangle.size()-1,triangle.get(triangle.size()-1).size()-1);
    }
    int tri(List<List<Integer>> list,int[][] arr,int m,int n){
        // if(m==list.size()-1) return list.get(m).get(n);
        // if(arr[m][n]!=-1) return arr[m][n];
        // int up=list.get(m).get(n)+tri(list,arr,m+1,n);
        // int dia=list.get(m).get(n)+tri(list,arr,m+1,n+1);

        // return arr[m][n]=Math.min(up,dia);
        for(int i=0;i<=n;i++){
                arr[m][i]=list.get(m).get(i);
        }
        for(int i=list.size()-2;i>=0;i--){
            for(int j=list.get(i).size()-1;j>=0;j--){
                
                
                    int up=0,dia=0;
                    up=list.get(i).get(j)+arr[i+1][j];
                    dia=list.get(i).get(j)+arr[i+1][j+1];
                    arr[i][j]=Math.min(up,dia);
                
            }
        }
        return arr[0][0];
    }
}