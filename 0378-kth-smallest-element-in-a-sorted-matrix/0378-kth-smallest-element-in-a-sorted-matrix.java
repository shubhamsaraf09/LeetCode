class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int l=0;
        int[] arr=new int[matrix.length*matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[l]=matrix[i][j];
                l++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}