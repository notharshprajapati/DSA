class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int size = m+n;
        int i;
        int j=0;
        for( i = 0;i<size;i++)
        {
            if(i-m>=0)
            {   nums1[i]=nums2[j];
                j++;
            }
        }
        for( i = 0;i<size-1;i++)
        {   for( j = i;j<size;j++)
            {
                if(nums1[i]>nums1[j])
                {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}