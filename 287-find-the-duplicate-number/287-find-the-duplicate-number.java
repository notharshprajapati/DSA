class Solution {
    public int findDuplicate(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i : arr) {
      if (map.containsKey(i)) {
        return i;
      } else {
        map.put(i, 1);
      }
    }
    return 0;
    }
}