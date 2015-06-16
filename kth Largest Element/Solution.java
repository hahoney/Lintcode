// use quick selection
import java.util.*;

class Solution {
    //param k : description of k
    //param numbers : array of numbers
    //return: description of return
    public int kthLargestElement(int k, ArrayList<Integer> numbers) {
        // write your code here
        int begin = 0, end = numbers.size() - 1;
        int kth = k - 1;
        while (begin <  end) {
            int pivot = partition(numbers, begin, end);
            if (pivot < kth) {
                begin = pivot + 1;
            } else if (pivot > kth) {
                end = pivot - 1;
            } else {
                return numbers.get(kth);
            }
        }
                        
        return numbers.get(kth);
    }
    
    private int partition(ArrayList<Integer> numbers, int i, int j) {
        // pivot is numbers(i)
        int begin = i + 1;
        int end = j;
        int pivot = numbers.get(i);
        while (true) {
            while (numbers.get(begin) > pivot && begin < j) { begin++; }
            while (numbers.get(end) < pivot && end > i) { end--; }
            if (begin >= end) { 
                break; 
            }
            swap(numbers, begin, end);
        }
        swap(numbers, i, end);
        System.out.println(numbers);
        return end;
    }
    
    private void swap(ArrayList<Integer> numbers, int i, int j) {
        int temp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);     
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 4, 7, 6, 5));
        System.out.println(sol.kthLargestElement(1, list));
    }
};