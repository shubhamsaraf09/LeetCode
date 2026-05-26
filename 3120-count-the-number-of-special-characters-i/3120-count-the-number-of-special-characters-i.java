class Solution {

    //A=65
    //a=97

    public int numberOfSpecialChars(String word) {
        Set<Character> set=new HashSet<>();
        int count=0;
        for(char ch : word.toCharArray()){
            set.add(ch);
        }
        for(char ch :set){
            if((int)ch < 97){
            int a=(int)ch+32;
            if(set.contains((char)a)) count++;
            }
        }
        return count;
    }
}