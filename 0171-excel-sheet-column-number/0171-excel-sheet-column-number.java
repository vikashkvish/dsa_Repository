class Solution {
    public int titleToNumber(String columnTitle) {
      int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + value;
        }
        return result;   
    }
    public static String numberToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; 
            
            char letter = (char) ('A' + (columnNumber % 26));
            result.insert(0, letter); 
            
            columnNumber /= 26; 
        }
        
        return result.toString();
    }
}