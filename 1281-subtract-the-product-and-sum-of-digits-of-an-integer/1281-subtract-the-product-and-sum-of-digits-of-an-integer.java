class Solution {
    public int subtractProductAndSum(int n) {
       int product=product_of_digits(n);
       int sum=sum_of_digits(n);
       return (product-sum);

    }
  public static int product_of_digits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * product_of_digits(n/10);
    }
    public static int sum_of_digits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+ sum_of_digits(n/10);
    }
}