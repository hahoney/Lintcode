import java.lang.Math;
    
class Solution {
    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int tryNumber = i;
            while ( tryNumber > 0) {
                if (tryNumber % 10 == k) {
                    count++;
                }
                tryNumber /= 10;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.digitCounts(2, 22));
    }
};