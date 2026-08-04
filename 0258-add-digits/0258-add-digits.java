class Solution {
    public int addDigits(int num) {
        if(num <= 9){
            return num;
        }
        int sum = 0; 
        while(num > 9){
            sum = sumOfDigits(num); 
            num = sum;
        }

        return sum;


    }
    private static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}