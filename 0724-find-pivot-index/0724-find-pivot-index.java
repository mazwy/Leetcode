class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0, right = 0;
        
        for (int i : nums)
            right += i;
        
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            
            if (right == left)
                return i;
            
            left += nums[i];
        }
        
        return -1;
    }
}