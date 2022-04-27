class Solution {
    public int removeDuplicates(int[] nums) {
        int i = nums.length;
        if(i > 0)
        {
            i = 1;
        }else{
            i = 0;
        }
        
        for (int n : nums)
        {
           if (n > nums[i-1])
           {
               nums[i++] = n; 
           }
            
        }
        return i;
    }
}