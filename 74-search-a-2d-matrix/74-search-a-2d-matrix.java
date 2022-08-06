class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        
    int n = arr.length;
    int m = arr[0].length;

    int i = 0;
    int j = m - 1;

    while (i < n && j >= 0) {
      System.out.println(arr[i][j] + " " + i + " " + j);
      if (arr[i][j] == tar) {
        return true;
      } else if (arr[i][j] < tar) {
        i++;
      } else if (arr[i][j] > tar) {
        j--;
      }
    }
    return false;
    }
}