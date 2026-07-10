class Solution {
    public int removeElement(int[] arr, int val) {
       int n=arr.length;
       int k=0;
       int i=0;
       while(i<n){
        if(arr[i]!=val){
            arr[k]=arr[i];
            k++;
            i++;
        }
        else{
            i++;
        }
       }
       return k;
    }
}