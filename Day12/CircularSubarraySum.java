class Solution {
    public int circularSubarraySum(int[] arr) {
        int totalSum = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        int currMax = 0, currMin = 0;
        boolean allNegative = true;

        for (int num : arr) {
            totalSum += num;

            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);

            if (num > 0) allNegative = false;
        }

        if (allNegative) return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}
