class Solution {
    public int majorityElement(int[] nums) {
        int ptr = nums[0];
        int count = 1;
        for(int i = 1; i<nums.length ; i++)
        {
            if(count == 0)
            {
                count++;
                ptr = nums[i];
            }else if(ptr == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return ptr;
    }
}