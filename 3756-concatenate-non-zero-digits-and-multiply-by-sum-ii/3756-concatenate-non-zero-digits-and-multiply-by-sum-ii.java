class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int mod = 1000000007;
        long[] val = new long[n + 1];
        int[] nz = new int[n + 1];
        long[] preSum = new long[n + 1];
        long[] power = new long[n + 1];

        power[0] = 1;
        for(int i = 1; i<= n; i++){
            power[i] = (power[i - 1]*10)%mod;

            int d = s.charAt(i - 1) - '0';
            preSum[i] = preSum[i - 1] + d;
            if(d==0){
                val[i] = val[i-1];
                nz[i] = nz[i - 1];
            }else{
                val[i] = (val[i - 1]*10 + d)%mod;
                nz[i] = nz[i - 1] + 1;
            }
        }
        int q = queries.length;
        int [] ans = new int[q];

        for(int i = 0; i<q; i++){
            int L = queries[i][0];
            int R = queries[i][1];

            long sum = preSum[R + 1] - preSum[L];

            int k = nz[R + 1] - nz[L];

            long prefixContribution = (val[L] * power[k])%mod;
            long x = (val[R + 1] - prefixContribution + mod) % mod;

            long res = (x*(sum % mod))% mod;
            ans[i] = (int)res;
        }

        return ans;
    }
}