class Solution {
    public String sortString(String s) {
        
        int arr[] = new int[26];
        StringBuilder sb = new StringBuilder();
        int loop = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[(int)s.charAt(i) - 97]++;
            loop++;
        }


        while(loop !=0)
        {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >0){
                    sb.append((char) (i+97));
                    arr[i]--;
                    loop--;
                }
            }

            for (int i = arr.length -1; i >=0; i--) {
                if(arr[i] >0){
                    sb.append((char) (i+97));
                    arr[i]--;
                    loop--;
                }
            }
        }
        return sb.toString();
    }
}