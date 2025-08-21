class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            int num=nums2[i];
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int[] arr=new int[list.size()];
        int j=0;
        for(int i : list){
            arr[j++]=i;
        }
        return arr;
    }
}