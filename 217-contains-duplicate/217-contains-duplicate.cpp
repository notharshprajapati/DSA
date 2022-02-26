class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        map<int,int> vec;
        for (int i : nums)
        {
            vec[i]++;
            if(vec[i]>1)
            {
                return true;
            }
        }
       return false; 
    }
};