class Solution {
    public int[][] insert(int[][] in, int[] ne) {
        List<int[]> res=new ArrayList<>();
        int i=0;
        while(i<in.length && in[i][1]<ne[0]){
            res.add(in[i]);
            i++;
        }
        
        while(i<in.length && in[i][0]<=ne[1]){
            ne[0]=Math.min(in[i][0],ne[0]);
            ne[1]=Math.max(in[i][1],ne[1]);
            i++;
        }
        res.add(ne);
        while(i<in.length){
            res.add(in[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}