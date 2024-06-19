class Solution {
    boolean check(int A[],int n,int m,int k,int x)
    {
        int ans=0,ctr=0;
        for(int i=0;i<n;i++)
        {
            if(A[i]<=x)
            {
                ctr++;
                if(ctr>=k)
                {
                    ctr=0;
                    ans++;
                }
            }
            else 
            ctr=0;
        }
        return ans>=m;
    }
    public int minDays(int[] A, int m, int k) {
        int n=A.length;
        int l=1,h=1000000000;
        int ans=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(check(A,n,m,k,mid))
            {
                ans=mid;
                h=mid-1;
            }
            else
                l=mid+1;;
        }
        return ans;
    }
}