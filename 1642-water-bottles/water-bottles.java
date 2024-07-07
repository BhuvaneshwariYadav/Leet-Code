class Solution {
    public int numWaterBottles(int numBottles, int A) {
        int f=numBottles;
        int ans=f;
        while(f>=A)
        {
            ans+=f/A;
            f=f%A+(f/A);
        }
        return ans;
    }
}