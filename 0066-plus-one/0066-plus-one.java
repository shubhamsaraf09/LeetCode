class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list=new ArrayList<>();
        int carry=1;
        int sum=0;
        for(int i=digits.length-1;i>=0;i--){
            sum=carry;
            sum+=digits[i];
            list.add(sum%10);
            carry=sum/10;
        }
        if(carry!=0){
            list.add(carry);
        }
        Collections.reverse(list);
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}