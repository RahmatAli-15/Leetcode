3110. Score of a String

  class Solution {
    public int scoreOfString(String s) {
        // edge case
        if (s.length() == 0) {
            return 0;
        }
        int dif = 0;
        for (int i = 1; i < s.length(); i++) {
            // absolute difference
            dif += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return dif;
    }
}
