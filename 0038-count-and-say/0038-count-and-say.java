class Solution {
    public String countAndSay(int n) {
       if(n<= 0){
         return "";
       }
       if(n==1){
         return "1";
       }
       String result = "1";
       while(n>1){
         StringBuilder next = new StringBuilder();
         for(int i = 0; i<result.length(); i++){
            int count = 1;
            while(i + 1 < result.length() && result.charAt(i) == result.charAt(i + 1)){
                count++;
                i++;
            }
            next.append(count).append(result.charAt(i));
         }
         result = next.toString();
         n--;
       }
       return result;
    }
}