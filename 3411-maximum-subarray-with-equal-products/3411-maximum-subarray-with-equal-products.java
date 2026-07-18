class Solution {
       public int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public long lcm(long a, long b) {
        return (a / gcd((int)a, (int)b)) * b;
    }

    public int maxLength(int[] nums) {

        int n = nums.length;
        int ans = 1;

        for (int i = 0; i < n; i++) {

            long product = 1;
            long lcm = 1;
            int gcd = 0;

            for (int j = i; j < n; j++) {

                product *= nums[j];
                gcd = gcd(gcd, nums[j]);
                lcm = lcm(lcm, nums[j]);

                if (product == lcm * gcd) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}