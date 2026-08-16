class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int count = 0;
        for(int i = 0; i<n; i++){
            sum += arr[i];
            if(i>=k){
                sum -= arr[i-k];
            }
            if(i >= k-1){
            if(sum >= threshold * k){
                count++;
            }
            }

        }
        return count;
    }
}