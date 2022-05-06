class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extra) {
        List<Boolean> list = new ArrayList<>();
        int max =  0;
        for(int i =0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]+extra >= max)
            {
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}