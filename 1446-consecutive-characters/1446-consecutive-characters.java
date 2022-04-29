class Solution {
        public int maxPower(String str) {
        int max = 0;
        char previous = ' ';
        for (int i = 0 ,count = 0; i < str.length(); ++i) {
            if (str.charAt(i) == previous) {
                count++;
            } else {
                count = 1;
                previous = str.charAt(i);
            }
            max = Math.max(max, count);
        }
        return max;
    }
}