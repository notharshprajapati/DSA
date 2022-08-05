class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int etot = (n*(n+1)/2);
        
        int tot = 0;
        for(int num : nums){
            tot +=num;
        }
        return etot - tot;
    }
}