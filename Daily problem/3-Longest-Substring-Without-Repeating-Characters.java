class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        int high=0; int low=0;
        int n=s.length(); int res=0;
        HashSet<Character> hash=new HashSet<>();
        while(high<n)
        {

           if(!hash.contains(s.charAt(high)))
           {
           
           hash.add(s.charAt(high));
         res=Math.max(res,high-low+1);
           }
            else{
                while(hash.contains(s.charAt(high)))
            {
               hash.remove(s.charAt(low));
               low++;
            }
            hash.add(s.charAt(high));}
           
          high++;
        }
        return res;
    }
}