class Solution {
    public int[] plusOne(int[] digits) { 
         int carry=0;
        int sum=0;
        int x=digits.length;
        int n=x-1;
        while(n>=0)
        {
            if(n==digits.length-1)
            {
                sum=(digits[n]+carry+1);
                digits[n]=sum%10;
                carry=sum/10;
                
                
                
            }
            else
            {
                sum=digits[n]+carry;
                digits[n]=sum%10;
                carry=sum/10;
                
            }
            n--;
            
        }
        if(carry==1)
        {
            int[]arr=new int[x+1];
            arr[0]=1;
            for(int i=1;i<arr.length;i++)
                arr[i]=digits[i-1];
            return arr;
                            
        }
        else
            return digits;
        
        
    }
}