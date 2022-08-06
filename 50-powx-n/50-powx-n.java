class Solution {
    public double myPow(double x, int n) {
    long nn = n;
    if (n < 0) nn = -n;
    double ans = power(x, nn);
    if (n < 0) ans = 1 / ans;
    return ans;
    }
    
    public double power(double x, long n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return x;
    }

    double ans = 0;
    if (n % 2 == 0) {
      ans = power(x, n / 2);
      ans = ans * ans;
    } else {
      ans = power(x, n / 2);
      ans = ans * ans * x;
    }

    return ans;
  }
}