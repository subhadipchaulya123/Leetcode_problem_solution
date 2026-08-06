class Solution {
    public int smallestNumber(int n, int t) {
        while(product_of_digit(n)% t !=0){
            n++;
        }
        return n;
    }
    private int product_of_digit(int n){
        int product=1;
        while(n != 0){
            product *= n%10;
            n /=  10;
        }
        return product;
    }
}