class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String  word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String ar = new String(arr);
            if(!map.containsKey(ar)){
                map.put(ar,new ArrayList<>());
            }
            map.get(ar).add(word);

        }
        return new ArrayList<>(map.values());
    }
}