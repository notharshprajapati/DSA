class Solution {

  public boolean searchMatrix(int[][] arr, int tar) {
    int n = arr.length;
    int m = arr[0].length;

    int i = 0;
    int j = m - 1;

    while (i < n && j >= 0) {
      if (arr[i][j] == tar) {
        return true;
      }
      if (arr[i][j] < tar) i++; else j--;
    }
    return false;
  }
}
