class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict=new HashSet<>(wordList);
        if(!dict.contains(endWord)) return 0;
        Queue<Pair<String,Integer>> q=new LinkedList<>();
        q.add(new Pair<>(beginWord,1));

        while(!q.isEmpty()){
            String word=q.peek().getKey();
            int step=q.peek().getValue();
            q.poll();

            if(word.equals(endWord)) return step;

            char[] arr=word.toCharArray();
            
            for(int i=0;i<arr.length;i++){
                char original=arr[i];
                for(char c='a';c<='z';c++){
                    arr[i]=c;
                    String newWord=new String(arr);
                    if(dict.contains(newWord)){
                        dict.remove(newWord);
                        q.add(new Pair<>(newWord,step+1));
                    }
                }
                arr[i]=original;
            }
        }
        return 0;
    }
}