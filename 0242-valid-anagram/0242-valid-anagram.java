class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(t.length()!=s.length()) return false;
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                int num=map.get(ch);
                map.remove(ch);
                map.put(ch,num+1);
            }
            else{
                map.put(ch,1);
            }
        }
        
        for(char ch : t.toCharArray()){
            if(map2.containsKey(ch)){
                int num=map2.get(ch);
                map2.remove(ch);
                map2.put(ch,num+1);
            }
            else{
                map2.put(ch,1);
            }
        }
        // if(map.size()!=map2.size()) return false;
        // for(char ch : t.toCharArray()){
        //     if(map2.containsKey(ch) && map.containsKey(ch)) {
        //         if(map2.get(ch)!=map.get(ch)) return false;
        //     }
        //     else if(!map2.containsKey(map.get(ch))) return false;
        // }
        return map.equals(map2);
    }
}