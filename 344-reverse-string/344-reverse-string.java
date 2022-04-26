class Solution {
    public void reverseString(char[] s) {
        int l =0;
        int r = s.length -1;
        revStr(s,l,r);
    }
    
    public void revStr(char[] s,int l ,int r)
    { 
        if(l>r)
        {
            return ;
        }
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        revStr(s,++l,--r);
    }
}