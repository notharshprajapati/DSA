class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        for(int i =0;i<size;i++)
        {
            int pointer = nums[i];
            int count = 0;
            for(int j = i;j<size;j++)
            {
                if(pointer == nums[j])
                {
                    count++;
                }
            }
            if(count > size/2)
            {
                return pointer;
            }
        }
        return 0;
    }
}