2490. Circular Sentence


  class Solution {
    public boolean isCircularSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Check the condition for each pair of consecutive words
        for (int i = 0; i < words.length - 1; i++) {
            // If the last character of the current word doesn't match
            // the first character of the next word, return false
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }
        
        // Check the circular condition for the first and last words
        // The last character of the last word should match the first character of the first word
        return words[words.length - 1].charAt(words[words.length - 1].length() - 1) == words[0].charAt(0);
    }
}
