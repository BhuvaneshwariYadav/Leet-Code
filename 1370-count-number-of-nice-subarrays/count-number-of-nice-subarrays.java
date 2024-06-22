class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] co = new int[nums.length + 1];
        co[0] = 1; 
        int sc = 0;
        int t = 0;
        for(int i : nums)
        {
            t += i & 1; 
            if(t - k >= 0)
                sc += co[t - k];
            
            co[t]++;
        }
        return sc;
    }
}