class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        int ans=0;
        int k=1;
        for(String i:logs)
        {
            if(Character.isLetterOrDigit(i.charAt(0)))
            {
                st.push(k+"");
                k++;
                ans++;
            }
            if(i.charAt(1)=='.' && !st.isEmpty())
            {
                st.pop();
                ans--;
            }
        }
        return ans;
    }
}