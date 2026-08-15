class Solution {
    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int totalwater = 0;
        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty() && height[stack.peek()]<height[i]){
                int bottom=stack.pop();
                if(stack.isEmpty()){
                    break;
                }

                int left=stack.peek();

                int width=i-left-1;
                int hei=Math.min(height[left],height[i])-height[bottom];

                totalwater+=width*hei;
            }
            stack.push(i);
        }
        return totalwater;
    }
}