class Solution {
    public boolean isAnagram(String s, String t) {
        int l1=s.length(); 
        int l2=t.length();

        if(l1!=l2){ return false;}

        int[] arr=new int[26];
        for(int i =0;i<l1;i++)
        {
            arr[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<l2;i++)
        {
            arr[t.charAt(i) - 'a']--;
        }

        for(int j:arr)
        {
            if(j!=0) {return false;}
        }
      return true;
        
    }
}