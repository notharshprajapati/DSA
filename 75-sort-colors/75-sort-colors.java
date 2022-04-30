class Solution {
    public void sortColors(int[] arr) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                c0++;
            } else if (arr[i] == 1) {
                c1++;
            } else if (arr[i] == 2) {
                c2++;
            }
        }
        c1 += c0;
        c2 += c1;
        for (int i = 0; i < c0; i++) {
            arr[i] = 0;
        }
        for (int i = c0; i < c1; i++) {
            arr[i] = 1;
        }
        for (int i = c1; i < c2; i++) {
            arr[i] = 2;
        }

    }
}