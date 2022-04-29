class Solution {
    public boolean makeEqual(String[] s) {
        int arr[] = new int[26];
        for(int k =0;k<s.length;k++)
        {
            for (int i = 0; i < s[k].length(); i++) {
                arr[(int)s[k].charAt(i)-97]++;
            } 
        }
        for(int i =0 ; i<26;i++)
        {
            if(arr[i]%s.length != 0)
            {
                return false;
            }
        }
     return true;   
    }
}