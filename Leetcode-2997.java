2997. Minimum Number of Operations to Make Array XOR Equal to K

  class Solution {
  public int minOperations(int[] nums, int k) {
    final int xors = Arrays.stream(nums).reduce((a, b) -> a ^ b).getAsInt();
    return Integer.bitCount(k ^ xors);
  }
}
