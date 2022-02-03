class Solution {
public:
int maxProfit(vector<int>& prices) {
int n = prices.size();
int l=0,r=n-1;
for(int i = 0 ; i<n ; i++)
{cout<<prices[l]<<prices[i]<<prices[r]<<prices[n-i-1];
if(prices[l]>prices[i] && n-i>i) //remove && n-i>i
{
l=i;
}
if(prices[r]<prices[n-i-1] && n-i>i)
{
r=n-i-1;
}
cout<<i<<endl<<l<<r<<endl;
cout<<endl;
}
if(l>r)
{
return 0;
}
return prices[r]-prices[l];
}
};