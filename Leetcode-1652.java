1652. Defuse the Bomb

  class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        
        if (k == 0) {
            // If k == 0, all elements in result are 0
            return result;
        }
        
        // Determine the direction and range of summation
        int start = k > 0 ? 1 : k;
        int end = k > 0 ? k : -1;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // Add the elements in the range specified by start and end
            for (int j = start; j != end + (k > 0 ? 1 : -1); j += (k > 0 ? 1 : -1)) {
                sum += code[(i + j + n) % n]; // Handle circular indexing
            }
            result[i] = sum;
        }
        
        return result;
    }
}
