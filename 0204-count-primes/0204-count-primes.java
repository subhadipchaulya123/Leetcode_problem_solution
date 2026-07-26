class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        boolean[] isComposite = new boolean[n];
        
        // Calculate square root limit once upfront
        int limit = (int) Math.sqrt(n);
        
        // Mark composite numbers up to the square root limit
        for (int i = 2; i <= limit; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        
        // Count how many numbers remain unmarked (prime)
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }
        return count;
    }
}
