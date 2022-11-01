class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, middle = (left + right) / 2;
        
        while (left <= right) {
            if (nums[middle] == target)
                return middle;
            if (nums[middle] > target) {
                right = middle - 1;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            }
            middle = (left + right) / 2;
        }
        
        return -1;
    }
}