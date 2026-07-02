class Solution {
    public int reverse(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum*10+ld;
            n/=10;

        }
        return sum;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
}