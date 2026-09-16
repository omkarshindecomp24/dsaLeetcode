class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int k = Math.max(word1.length(), word2.length());
        int i = 0;
        while (i < k) {
            if (i < word1.length())
                str.append(word1.charAt(i));
            if (i < word2.length())
                str.append(word2.charAt(i));
            i++;
        }
        return str.toString();
    }
}