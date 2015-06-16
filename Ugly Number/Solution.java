// a naive way of implementation is that determine if a number is ugly then increment every integer
// until the kth ugly number.
// A better way is to think if there is a way to make the ugly number ordered.
import java.util.*;


class Solution {
    /**
     * @param k: The number k.
     * @return: The kth prime number as description.
     */
    public long kthPrimeNumber(int k) {
        // write your code here
        int index = 1;
        List<Long> ugly = new ArrayList<Long>();
        long lastVar = 1;
        ugly.add(lastVar);
        int index3 = 0, index5 = 0, index7 = 0; // the index of element to which a 3, 5, 7 will be multiplied
        while (index <= k) {
            lastVar = getMin(ugly, index3, index5, index7);
            if (lastVar == ugly.get(index3) * 3) {
                index3++;
            }
            if (lastVar == ugly.get(index5) * 5) {
                index5++;
            }
            if (lastVar == ugly.get(index7) * 7) {
                index7++;
            }
            ugly.add(lastVar);
            index++;
            
        }
        return lastVar;
    }
    
    private long getMin(List<Long> list, int indexThree, int indexFive, int indexSeven) {
         long multiplyByThree = list.get(indexThree) * 3;
         long multiplyByFive = list.get(indexFive) * 5;
         long multiplyBySeven = list.get(indexSeven) * 7;
         long result = multiplyByThree < multiplyByFive ? multiplyByThree : multiplyByFive;
         result = result < multiplyBySeven ? result : multiplyBySeven;
         return result;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.kthPrimeNumber(6));
    }
};