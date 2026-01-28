class Solution {
    public String addStrings(String num1, String num2) {
        int carry=0;
        String ans="";
        int i=num1.length()-1,j=num2.length()-1;
        while(i>=0 && j>=0){
            
            int sum=0;
            int a=(num1.charAt(i)-'0')+(num2.charAt(j)-'0')+carry;
            
            if(a>=10){
                a=a%10;
                carry=1;
            }
            else carry=0;
            ans=ans+a;
            i--;
            j--;
        }

        while(i>=0){
            int a=carry+(num1.charAt(i)-'0');
            if(a>=10){
                a=a%10;
                carry=1;
            }
            else carry=0;
            ans=ans+a;
            i--;
        }

        while(j>=0){
            int a=carry+(num2.charAt(j)-'0');
            if(a>=10){
                a=a%10;
                carry=1;
            }
            else carry=0;
            ans=ans+a;
            j--;
        }
        if(carry==1){
            ans=ans+carry;
        }
        String reversed = new StringBuilder(ans).reverse().toString();
        return reversed;
    }
}