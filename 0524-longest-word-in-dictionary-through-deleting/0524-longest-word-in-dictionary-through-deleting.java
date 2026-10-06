class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String longestWord = "";

        for(String word: dictionary){
            if(isSubsequence(s, word)){
                if(word.length() > longestWord.length() || (word.length() == longestWord.length() && word.compareTo(longestWord) < 0)){
                longestWord = word;
                }
            }
            
        }

        return longestWord;
    }

    private boolean isSubsequence(String s, String word){
        int i = 0, j = 0;
        while(i < s.length() && j < word.length()){
            if(s.charAt(i) == word.charAt(j)){
                j++;
            }
            i++;
        }
        return j==word.length();
    }
}