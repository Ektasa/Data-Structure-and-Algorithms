class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] f=new boolean[s.length()+1];
        f[0]=true;
        for(int i=1;i<=s.length();i++)
        {
            for(String sts:wordDict)
            {
              
                if(sts.length()<=i)
                {
                      if(f[i-sts.length()]){
                    if(s.substring(i-sts.length(),i).equals(sts))
                    {
                        f[i]=true; break;
                    }
                }
            }
            }
        }

        return f[s.length()];
    }
}