class Solution {
      StringBuilder str=new StringBuilder();
    public String countAndSay(int n) {
      
        if(n==1) return str.toString();
       // str.append(n.toString());
        for(int i=1;i<n;i++)
        {
            str.append(i.toString());
        }
        // countAndSay(n-1);
        return countAndSay(n-1);
    }
}