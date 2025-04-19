import java.util.Arrays;

// Count Fair Pairs in an Array
// Given an integer array nums of size n and two integers lower and upper, return the number of pairs (i, j) such that i < j and lower <= nums[i] + nums[j] <= upper.
class CountFairPairs {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        Arrays.sort(nums);
        long ans = 0;

        for (int i = 0; i < n - 1; i++) {
            int lb = lowerBound(nums, i + 1, n, lower - nums[i]);
            int ub = upperBound(nums, i + 1, n, upper - nums[i]);
            ans += (ub - lb);
        }
        return ans;
    }

    // Binary search for searching the Lower-Bound element
    private int lowerBound(int nums[], int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    // Binary search for searching the Upper-Bound element
    private int upperBound(int nums[], int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target)
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        CountFairPairs cfp = new CountFairPairs();
        int[] nums = {1, 2, 3, 4, 5};
        int lower = 3;
        int upper = 6;
        System.out.println(cfp.countFairPairs(nums, lower, upper)); // Output: 6
    }

}
