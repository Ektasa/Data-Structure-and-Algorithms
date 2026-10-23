class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        int high=0; int low=0;
        int n=s.length(); int res=0;
        HashSet<Character> hash=new HashSet<>();

            char[] chars=s.toCharArray();

            for(int i=0;i<chars.length;i++)
            {
                while(hash.contains(chars[i]))
                {
                    hash.remove(chars[high]);
                    high++;
                }

                hash.add(chars[i]);
                res=Math.max(res, hash.size());
            }

        // while(high<n)
        // {

        //    if(!hash.contains(s.charAt(high)))
        //    {
           
        //    hash.add(s.charAt(high));
        //  res=Math.max(res,high-low+1);
        //    }
        //     else{
        //         while(hash.contains(s.charAt(high)))
        //     {
        //        hash.remove(s.charAt(low));
        //        low++;
        //     }
        //     hash.add(s.charAt(high));}
           
        //   high++;
        // }
         return res;
    }
}