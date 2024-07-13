class Solution {
    public List<Integer> survivedRobotsHealths(int[] P, int[] H, String D) {
        int n=P.length;
        Integer idx[]=new Integer[n];
        for(int i=0;i<n;i++)
            idx[i]=i;
        Arrays.sort (idx, (lhs,rhs) -> Integer.compare(P[lhs], P[rhs]));
        Stack<Integer> st=new Stack<>();
        for(int i:idx)
        {
            if(D.charAt(i)=='R')
                st.push(i);
            else
            {
                while(!st.isEmpty() && H[i]>0)
                {
                    int j=st.pop();
                    if(H[i]<H[j])
                    {
                        H[i]=0;
                        H[j]-=1;
                        st.push(j);
                    }
                    else if(H[j]<H[i])
                    {
                        H[i]-=1;
                        H[j]=0;
                    }
                    else
                    {
                        H[i]=0;
                        H[j]=0;
                    }
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:H)
        {
            if(i>0)
                ans.add(i);
        }
        return ans;
    }
}