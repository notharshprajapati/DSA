class Solution {
    public int fib(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int n1 = fib(n - 1);
        int n2 = fib(n - 2);
        int sum = n1 + n2;
        return sum;
    }
}