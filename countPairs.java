class CountPairs {
    //2176. Count Equal and Divisible Pairs in an Array
    //Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
    
    public int countPairs(int[] nums, int k) {
        int n = nums.length;
        int res = 0;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if((i*j) % k ==0 && (nums[i] == nums[j])){
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        CountPairs cp = new CountPairs();
        int[] nums = {1, 2, 2, 4, 5};
        int k = 2;
        System.out.println(cp.countPairs(nums, k)); // Output: 1
    }
}