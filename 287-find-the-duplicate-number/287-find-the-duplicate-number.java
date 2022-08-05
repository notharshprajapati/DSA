class Solution {
    public int findDuplicate(int[] arr) {
    Arrays.sort(arr);
    int last = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (last == arr[i]) {
        return last;
      } else {
        last = arr[i];
      }
    }
    return -1;
    }
}