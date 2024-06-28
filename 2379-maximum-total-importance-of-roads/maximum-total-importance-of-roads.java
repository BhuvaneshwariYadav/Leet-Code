class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long d[]=new long[n];
        int k=1;
        for(int i[]:roads)
        {
            d[i[0]]++;
            d[i[1]]++;
        }
        Arrays.sort(d);  
        long ans=0;
        for(int i=0;i<n;i++,k++)
        {
            System.out.println(d[i]+"  "+k);
            ans+=d[i]*k;
        }
        return ans;
    }
}