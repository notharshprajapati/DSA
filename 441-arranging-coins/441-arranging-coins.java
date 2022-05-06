class Solution {
    public int arrangeCoins(int n) {
        long sum = 0;
        long i =0;
        while(true)
        {
            if(sum <= n)
            {
                sum += ++i;
            }else{
                break;
            }
        }
        return (int)i-1;
    }
}