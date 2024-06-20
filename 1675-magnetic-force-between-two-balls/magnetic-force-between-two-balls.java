class Solution {
    boolean check(int a[],int m,int ans)
    {
        int last=a[0];
        int ctr=m-1;
        for(int i=1;i<a.length && ctr>0;i++)
            if(a[i]-last >=ans)
            {
                last=a[i];
                ctr--;
            }
        return ctr==0;
    }
    public int maxDistance(int[] A, int m) {
        int n=A.length;
        Arrays.sort(A);
        int l=1,h=A[n-1]-A[0];
        int ans=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(check(A,m,mid))
            {
                ans=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return ans;
    }
}