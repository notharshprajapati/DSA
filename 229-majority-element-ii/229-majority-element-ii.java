class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n1=-1,n2=-1,c1=0,c2=0;
        
        for(int i : nums){
            if(n1 == i) c1++;
            else if(n2 == i) c2 ++;
            else if(c1 == 0) {n1 = i ; c1 = 1;}
            else if(c2 == 0) {n2 = i ; c2 = 1;}
            else {c1--; c2--;}
        }
        
        List<Integer> list = new ArrayList<Integer>();
        
        c1= 0; c2 =0;
        
        for(int i : nums){  
            if(n1 == i)c1++;
            else if(n2 == i)c2++;
        }      
        
        if(c1 > nums.length/3) list.add(n1);
        if(c2 > nums.length/3) list.add(n2);
        
        return list;
    }
}