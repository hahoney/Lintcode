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
        if (n < 10) {
            if (n >= k) {
                return 1;
            } else {
                return 0;
            }
        }
        int firstNumber = n;
        int order = 0;
        while (firstNumber > 10) {
            firstNumber /= 10;
            order++;
        }
        int f = 1;
        while (order > 0) {
            f *= 10;
            order--;
        }
        for (int i = 0; i <= firstNumber; i++) {
            if (i == k) {
                if (k == firstNumber) {
                    count = count - firstNumber * f + n + 1;
                } else {
                    count += f;
                }
            }
            count += digitCounts(k, f - 1);
        }
        return count;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.digitCounts(2, 302));
    }
};