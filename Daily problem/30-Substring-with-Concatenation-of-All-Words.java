class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans=new ArrayList<>();

        if(words.length==0|| s.length()==0)
        {return ans;}

        int wordsize=words[0].length();
        int wordcount=words.length;
        int N=s.length();

        HashMap<String, Integer> original=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            original.put(words[i],original.getOrDefault(words[i],0)+1);
        }

        for(int offset=0; offset<wordsize;offset++)
        {
            HashMap<String,Integer> curr=new HashMap<>();
            int start=offset;
            int count=0;
            for(int end=offset;end+wordsize<=N;end+=wordsize)
            {
                String currW=s.substring(end, end+wordsize);
                if(original.containsKey(currW))
                {
                    curr.put(currW,curr.getOrDefault(currW,0)+1);
                    count++;

                    while(curr.get(currW)>original.get(currW))
                    {
                        String startW=s.substring(start,start+wordsize);
                        curr.put(startW,curr.get(startW)-1);
                        start+=wordsize;
                        count--;
                    }

                    if(count==wordcount)
                    {
                        ans.add(start);
                    }
                }
                else
                {
                    count=0;
                    start=end+wordsize;
                    curr.clear();
                }
            }
        }
        return ans;
    }
}