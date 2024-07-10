class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        int ans=0;
        int k=1;
        for(String i:logs)
        {
            if(i.charAt(0)!='.')
            {
                st.push(k+"");
                k++;
                ans++;
            }
            if(i.charAt(1)=='.' && ans!=0)
            {
                st.pop();
                ans--;
            }
        }
        return ans;
    }
}