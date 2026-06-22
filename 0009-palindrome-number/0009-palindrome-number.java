class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int original=x;
     while(x>0){
        int remainder=x%10;
        sum =(sum*10) + remainder;
        x=x/10;
     } 
     if(original==sum){
        return true;
     } 
     return false;
    }
}