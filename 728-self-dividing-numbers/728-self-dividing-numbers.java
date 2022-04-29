class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> list = new ArrayList<Integer>();

        for(int i = left ;i <=right ;i++)
        {
            if (isSelfDiv(i)==0) {
                list.add(i);
            }
            
        }
        return list;
    }
    
    public int isSelfDiv(int i)
    {
       int orignal = i;
        while(i !=0)
        {
            if(i%10 == 0 || i == 0)
            {
                return 1;
            }
            
            if(orignal %(i%10) != 0)
            {
                return 1;
            }
            i = i/10;
        }
        return 0;
    }
}