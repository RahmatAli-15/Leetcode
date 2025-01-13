3223. Minimum Length of String After Operations

  class Solution {
    public int minimumLength(String s) {
        
   int[] freq = new int[26];
    Arrays.fill(freq, 0);
    int ans = s.length();
    for(int i = 0; i < s.length(); ++i){
        freq[s.charAt(i) - 'a']++;
        if(freq[s.charAt(i) - 'a'] != 1 && freq[s.charAt(i) - 'a'] % 2 == 1) ans -= 2;
    }
    return ans;
}
}
