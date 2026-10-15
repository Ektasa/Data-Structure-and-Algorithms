class Solution {
    public int findKthPositive(int[] arr, int k) {
        int currentMissing = 0;
        int expected = 1;
        int i = 0;
        
        while (i < arr.length) {
            if (arr[i] == expected) {
                // If the number exists in the array, move to the next array element
                i++;
            } else {
                // If there is a gap, this 'expected' number is missing
                k--;
                if (k == 0) {
                    return expected;
                }
            }
            expected++;
        }
        
        // If the k-th missing number is greater than all elements in the array
        return expected + k - 1;
    }
}