class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i <numRows; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.get(i).add(0, 1);
                } else {
                    int temp = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    list.get(i).add(0, temp);
                }
            }
        }
        return list;
    }
}