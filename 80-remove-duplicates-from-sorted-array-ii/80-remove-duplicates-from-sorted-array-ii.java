class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        int flag  = 0;
        for (int n : nums)
        { 
           if ( flag < 2 || n > nums[i-2])
           {
               nums[i++] = n; 
               flag++;
           } 
        }
        return i;
    }
}