class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
      for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (tar == arr[i][j]) {
          return true;
        }
      }
    }
    return false;
    }
}