class Solution {
    public double myPow(double x, int n) {
        int power = n;
        if(n<0){
            x = 1/x;
            power = -power;
        }

        return pow(x, power);
        
    }
    private double pow(double x, long power){
        if(power==0){
            return 1;
        }
        double half = pow(x, power/2);

        return power%2==0? half*half : half*half*x;
    }
}