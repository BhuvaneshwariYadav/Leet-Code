class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        ArrayList<Integer> g[]=new ArrayList[n];
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            g[i]=new ArrayList<>();
            ans.add(new  ArrayList<>());
        }
        for(int i[]:edges)
            g[i[0]].add(i[1]);
        for(int i=0;i<n;i++)
            dfs(i,i,g,new HashSet<>(),ans);
        return ans;
    }
    void dfs(int p,int c,ArrayList<Integer>g[],Set<Integer>hs,List<List<Integer>> res)
    {
        hs.add(c);
        for(int d:g[c])
            if(!hs.contains(d))
            {
                res.get(d).add(p);
                dfs(p,d,g,hs,res);
            }
    }
}