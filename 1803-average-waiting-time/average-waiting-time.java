class Solution {
    public double averageWaitingTime(int[][] C) {
        //C[i][0] is AT
        //C[i][1] is BT
        int ct=C[0][0]+C[0][1];
        double wt=C[0][1];
        int n=C.length;
        for(int i=1;i<n;i++)
        {
            int x=C[i][0];
            int s=Math.max(x,ct);
            int e=s+C[i][1];
            ct=e;
            wt+=e-x;
        }
        return wt/n;
    }
}