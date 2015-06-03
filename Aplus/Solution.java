class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.''
        // do from head to tail
        while (b != 0) {
            int carry = a & b; // same bits are either carry bits or zero
            a = a ^ b; // find different remaining bits, we get everything except the carry
            b = carry << 1; // if a 1 b 1 then  a ^ b is 0 and a & b is 1 (carry)
            // if a 0 b 0 then a ^ b is 0 and a & b is 0 (not carry)
        }
    }
};