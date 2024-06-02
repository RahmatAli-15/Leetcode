344. Reverse String

  class Solution {
    public void reverseString(char[] s) {
    int start = 0;
    int end = s.length-1;
    while (start < end) {
      //swap
      char temp = s[start];
      s[start] = s[end];
      s[end] = temp;
      
      start ++;
      end --;
   }
 }

}
