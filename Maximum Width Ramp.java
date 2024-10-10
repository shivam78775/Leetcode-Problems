import java.util.Stack;

public class leetcode {

    class Solution {
        // Method to find the maximum width ramp
        // A ramp is a pair (i, j) where i < j and nums[i] <= nums[j]
        public static int maxWidthRamp(int[] nums) {
            // Create a stack to store indices
            Stack<Integer> stack = new Stack<>();
            
            int n = nums.length; // Length of the input array
            
            // First loop: build a stack of indices that have decreasing values from left to right
            // These indices will be potential candidates for the left end of the ramp (i)
            for (int i = 0; i < n; i++) {
                // Push the index to stack only if it's the first or the current number is smaller than the number at the top of the stack
                if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                    stack.push(i); // Push index to stack
                }
            }
    
            // Variable to store the result (maximum width of ramp)
            int res = Integer.MIN_VALUE;
            
            // Second loop: check for possible ramps from the rightmost index (n-1) to 0
            // The goal is to find the largest width ramp where nums[i] <= nums[j]
            for (int i = n - 1; i >= 0; i--) {
                // While the current number (nums[i]) is greater than or equal to the number at the top index in the stack,
                // we can calculate the width (i - stack.pop()) and update the result if it's larger than the current maximum width
                while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                    res = Math.max(res, i - stack.pop()); // Update the result with the maximum width found
                }
                // If the stack is empty, no further ramps can be formed, so we can exit the loop early
                if (stack.isEmpty()) {
                    break;
                }
            }
    
            // Return the maximum width of the ramp found
            return res;
        }

        public static void main(String[] args) {
            int [] nums = {9,8,1,0,1,9,4,0,4,1};
            int ans = maxWidthRamp(nums);
            System.out.println(ans);
        }
    }
    
}
