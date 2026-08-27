class Solution {
    public String minWindow(String s, String t) {
        if(s==null|| t==null|| s.length()==0|| t.length()==0||s.length()<t.length())
        {
            return new String();
        }
        int[] map=new int[128];
        int count=t.length();
        int start=0,end=0,minlen=Integer.MAX_VALUE, startIndex=0;

        for(char c:t.toCharArray())
        {
            map[c]++;
        }

        char[] chS=s.toCharArray();

        while(end<chS.length)
        {
            if(map[chS[end++]]-- >0){
                count--;
            }
            while(count==0)
            {
                if(end-start<minlen)
                {
                    startIndex=start;
                    minlen=end-start;
                }
                if(map[chS[start++]]++==0)
                {
                    count++;
                }
            }
        }

        return minlen== Integer.MAX_VALUE ? new String(): new String(chS, startIndex, minlen);
    }
}