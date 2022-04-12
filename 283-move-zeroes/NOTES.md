if(nums[i]==0)
{
int temp = nums[i];
nums[i] = nums[i+1];
nums[i+1] = temp;
}
if(!nums[i])
{
count++;
}