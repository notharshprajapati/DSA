class Solution {
    public int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        int prod =1;
        prod = (arr[size - 1] -1) * (arr[size -2] -1);
        return prod;
    }
}