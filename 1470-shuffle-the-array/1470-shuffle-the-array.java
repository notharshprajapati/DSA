class Solution {
    public int[] shuffle(int[] arr, int n) {
        
        int arr2[]= new int[2*n];
        int k = 0;
        for(int i = 0;i<n;i++)
        {
            arr2[k++]=arr[i];
            arr2[k++]=arr[i + n];
        }
        return arr2;
    }
}