class Solution {
    public int reverse(int x) {
        long reverse_integer=0;
    while(x != 0){
        int remainder=x%10;
       reverse_integer=(reverse_integer*10)+remainder;
       x=x/10;
    }
    if(reverse_integer<Integer.MIN_VALUE || reverse_integer>Integer.MAX_VALUE ){
        return 0;
    }
    else{
        return (int)reverse_integer;
    }
    }
}