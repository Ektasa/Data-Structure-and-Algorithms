class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> smap=new HashMap<>();
        HashMap<Character,String> pmap=new HashMap<>();
        String[] words = s.split("\\s+");
       if(pattern.length()!=words.length){
        return false;
       }
        for(int i=0;i<pattern.length();i++)
        {
          char c=pattern.charAt(i);
           if(pmap.containsKey(c) && !pmap.get(c).equals(words[i]))
           {
            return false;
           }
           if(smap.containsKey(words[i])&&  smap.get(words[i])!=c)
           {
            return false;
           }
            pmap.put(c,words[i]);
            smap.put(words[i],c);
        }
        
      
      return true;

    }
}