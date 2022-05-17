class Solution {
public int[] sortArray(int[] nums) {
for(int itr = 1; itr<nums.length ; itr++ )
{
​
for(int i= 0; i<nums.length-itr ; i++)
{
if(nums[i] > nums[i+1])
{
swap(nums,i,i+1);
}
System.out.print(nums[i]+" ");
}
System.out.println();
}
return nums;
}
public void swap(int[] nums,int a,int b) {
int temp = nums[a];
nums[a] = nums[b];
nums[b] = temp;
}
public void pArray(int[] nums) {
for(int i : nums)
{
System.out.print(i+" ");
}
System.out.println();
}
}