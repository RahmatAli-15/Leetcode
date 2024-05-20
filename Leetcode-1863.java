1863. Sum of All Subset XOR Totals

  class Solution {
  public int subsetXORSum(int[] nums) {
    return Arrays.stream(nums).reduce((a, b) -> a | b).getAsInt() << nums.length - 1;
  }
}
