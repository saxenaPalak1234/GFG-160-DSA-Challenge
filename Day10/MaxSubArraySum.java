class Solution {
    public long maxSubarraySum(int[] arr) {
        long maxh = arr[0];     // max ending here
        long maxf = arr[0];     // max so far

        for (int i = 1; i < arr.length; i++) {
            maxh = Math.max(arr[i], maxh + arr[i]);
            maxf = Math.max(maxf, maxh);
        }

        return maxf;
    }
}
