class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        // test how many 2 and 5 factors
        if (n < 0) return 0;
        int countOfFive = 0;
        // from 5 to 15 there are three 5s; n/5 gives all the possible number that has 5
       long factor = 5;
       while (factor <= n) {
           countOfFive += n /factor;
           factor *= 5;
       }
       return countOfFive;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        long input = 5555550000000L;
        long output = sol.trailingZeros(input);
        System.out.println(output);
    }
};