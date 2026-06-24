class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even_number(nums[i])){
                count++;
            }
        }
        return count;
        
    }
    static boolean even_number(int num){
        int number_digits=digit(num);
        return number_digits%2==0;
    }
    static int digit(int num){
       return (int)(Math.log10(num))+1;
    }
}