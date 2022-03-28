class Solution {
    public int search(int[] nums, int tar) {
        int r = nums.length - 1;
        int l = 0;
        int mid = 0;
        while (l <r) {
            mid = (r + l) / 2;
            if (nums[mid] == tar) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= tar && tar < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < tar && tar <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return nums[l] == tar? l: -1;
    }
}