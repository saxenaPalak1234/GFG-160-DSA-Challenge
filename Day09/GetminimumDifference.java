class Solution {
public:
    int getMinDiff(vector<int>& arr, int k) {
        int n = arr.size();
        vector<pair<int, int>> modifiedHeights;
        vector<int> frequency(n, 0);

        for (int i = 0; i < n; i++) {
            if (arr[i] - k >= 0) {
                modifiedHeights.emplace_back(arr[i] - k, i);
            }
            modifiedHeights.emplace_back(arr[i] + k, i);
        }

        sort(modifiedHeights.begin(), modifiedHeights.end());

        int left = 0, right = 0, covered = 0, minDifference = INT_MAX;

        while (right < modifiedHeights.size()) {
            if (frequency[modifiedHeights[right].second]++ == 0) {
                covered++;
            }

            while (covered == n) {
                minDifference = min(minDifference, modifiedHeights[right].first - modifiedHeights[left].first);

                if (--frequency[modifiedHeights[left].second] == 0) {
                    covered--;
                }
                left++;
            }
            right++;
        }

        return minDifference;
    }
};
