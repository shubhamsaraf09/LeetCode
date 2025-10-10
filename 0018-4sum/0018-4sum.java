// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         //List<List<Integer>> list=new ArrayList<>();
        
//         Set<List<Integer>> set2=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 Set<Long> set=new HashSet<>();
//                 for(int k=j+1;k<nums.length;k++){
//                     Long n=(Long)target-((Long)nums[i]+nums[j]+nums[k]);
//                     if(set.contains(n)){
//                         List<Integer> l=new ArrayList<>();
//                         l.add(nums[i]);
//                         l.add(nums[j]);
//                         l.add(nums[k]);
//                         l.add((int)n);
//                         Collections.sort(l); 
//                         set2.add(l);
//                     }
//                     set.add(nums[k]);
//                 }
//             }
//         }
//         List<List<Integer>> list=new ArrayList<>();
//         for (List<Integer> item : set2) {
//             list.add(item);
//         }

//         return list;
//     }
// }
import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set2 = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> seen = new HashSet<>(); // fresh for each (i,j)

                for (int k = j + 1; k < n; k++) {
                    // use long for intermediate calculation to avoid overflow
                    long needLong = (long) target - ((long) nums[i] + nums[j] + nums[k]);

                    // iff needLong fits in int, check seen (seen only contains ints from nums)
                    if (needLong >= Integer.MIN_VALUE && needLong <= Integer.MAX_VALUE) {
                        int need = (int) needLong;
                        if (seen.contains(need)) {
                            List<Integer> quad = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], need));
                            Collections.sort(quad);
                            set2.add(quad);
                        }
                    }
                    seen.add(nums[k]);
                }
            }
        }

        return new ArrayList<>(set2);
    }
}
