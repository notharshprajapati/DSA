class Solution {
    public void reverseString(char[] s) {

        revStr(s,0,s.length -1);
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