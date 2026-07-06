class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            int max = 0;
            int min = 9;
            while (digit > 0) {
                int ld = digit % 10;
                max = Math.max(max, ld);
                min = Math.min(min, ld);
                digit /= 10;
            }
            int range = max - min;
            if (range > maxRange) {
                maxRange = range;
                sum = nums[i];
            } else if (range == maxRange) {
                sum += nums[i];
            }

        }
        return sum;
    }
}