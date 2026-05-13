class Solution {
    public String convert(String s, int numRows) {
        ArrayList<ArrayList<Character>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<Character>());
        }
        int i=0;
        while(i<s.length()){
            int j=0;
            while(j<numRows){
                if(i<s.length()) list.get(j).add(s.charAt(i));
                j++;
                i++;
            }
            j=j-2;
            while(j>0){
               if(i<s.length())  list.get(j).add(s.charAt(i));
                j--;
                i++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int k=0;k<list.size();k++){
            for(int j=0;j<list.get(k).size();j++){
                ans.append(list.get(k).get(j));
            }
        }
        return ans.toString();
    }
}