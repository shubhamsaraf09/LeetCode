class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans=new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                ans[i][image.length-1-j]=1^image[i][j];
            }
        }
        return ans;
    }
}