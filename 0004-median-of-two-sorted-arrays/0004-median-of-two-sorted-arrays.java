class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=n-1;
        int j=m-1;
        int[] arr=new int[n+m];
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                arr[k--]=nums1[i--];
            }
            else{
                arr[k--]=nums2[j--];
            }
        }
        while(i>=0){
            arr[k--]=nums1[i--];
        }
        while(j>=0){
            arr[k--]=nums2[j--];
        }

        int x=arr.length;
        double ans=0;
        int mid=x/2;
        if(x%2==0){
            ans+=arr[mid]+arr[mid-1];
            ans=ans/2;
        }
        else{
            ans+=arr[mid];
        }
        return ans;

    }
}