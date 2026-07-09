class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> arr =new ArrayList<>();
        int m=bank.length;
        int n=bank[0].length();
        for(int i=0;i<m;i++){
            int count=0;
            String str=bank[i];
            for(int j=0;j<n;j++){
                int val=str.charAt(j)-'0';
                if(val==1) count++;
            }
            if(count>=1) arr.add(count);
        }
        if(arr.size()<=1) return 0;
        int ans=0;
        for(int k=1;k<arr.size();k++){
            ans+=arr.get(k-1)*arr.get(k);
        }
        return ans;
    }
}