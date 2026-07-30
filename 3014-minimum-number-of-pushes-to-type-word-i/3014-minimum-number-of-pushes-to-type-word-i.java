class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        
        int groups = n / 8; // Number of fully filled layers (of 8 keys)
        int rem = n % 8;    // Remaining letters on the next layer
        
        // Math formula replacing the entire loop
        return (4 * groups * (groups + 1)) + (rem * (groups + 1));
    }
}
