class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = sumOfSquares(n);
        int sum = 0;

        while(slow != fast && fast != 1 ){
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));

        }
        return fast==1;
    }
    public int sumOfSquares(int n){
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            sum += (digit*digit);
            n /= 10;
        }

        return sum;
    }
}