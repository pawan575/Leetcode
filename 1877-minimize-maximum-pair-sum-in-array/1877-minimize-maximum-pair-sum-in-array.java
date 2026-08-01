class Solution {
    // public void mergeSort(int[] nums){
    //     int n=nums.length;
    //     if(n==1) return;
    //     int[] a=new int[n/2];
    //     int[] b=new int[n/2];
    //     int idx=0;
    //     for(int i=0;i<a.length;i++) a[i]=nums[idx++];
    //     for(int i=0;i<b.length;i++) b[i]=nums[idx++];
    //     mergeSort(a);
    //     mergeSort(b);
    //     merge(a,b,nums);

    // }
    // public void merge(int[] a,int[] b,int[] c){
    //     int i=0;int j=0;int k=0;
    //     while(i<a.length && j<b.length){
    //         if(a[i]<=b[j]) c[k++]=a[i++];
    //         else{
    //             c[k++]=b[j++];
    //         }
    //     }
        
           
           
    //  }
    public int minPairSum(int[] nums) {
        // mergeSort(nums);
        Arrays.sort(nums);
        int max=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int pairSum=nums[i++]+nums[j--];
            max=Math.max(max,pairSum);
            
        }
        return max;
    }
}