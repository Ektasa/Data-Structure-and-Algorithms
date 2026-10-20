class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
             int j=0;
             while(j<n-1)
             {
                s.charAt(j)=s.charAt(j+1);j++;
             }
             s.charAt(n-i-1)=ch;

             if(s.equals(goal))
             {
                return true;
             }
        }

        return false;
        
    }
}