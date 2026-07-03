class Solution {
    public int addDigits(int num) {
       while(num>9){
        num=sum_of_digit(num);
        
       } 
      return num;
    }
    static int sum_of_digit(int n){
        int ans=0;
        if(n<0){
            n=Math.abs(n);
        }
        while(n>0){
            int remainder=n%10;
            ans=ans+remainder;
            n=n/10;
        }
        return ans;
    }
    
}