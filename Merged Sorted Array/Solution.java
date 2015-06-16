import java.util.*;

class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your code here
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }
        int indexA = 0;
        int indexB = 0;
        while (indexA < A.size() && indexB < B.size()) {
            if (A.get(indexA) < B.get(indexB)) {
                mergedList.add(A.get(indexA));
                indexA++;
            } else {
                mergedList.add(B.get(indexB));
                indexB++;
            }
        }
        while (indexA < A.size()) {
            mergedList.add(A.get(indexA));
            indexA++;
        }
        while (indexB < B.size()) {
            mergedList.add(B.get(indexB));
            indexB++;
        }
        return mergedList;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(7));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(5, 7));
        
    }
}