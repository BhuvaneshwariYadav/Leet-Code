class Solution {
    public int minOperations(String[] logs) {
        int ans=0;
        for(String i:logs)
        {
            if(i.charAt(0)!='.')
                ans++;
            if(i.charAt(1)=='.' && ans!=0)
                ans--;
        }
        return ans;
    }
}