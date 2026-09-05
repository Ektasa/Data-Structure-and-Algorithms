class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    if(strs==null|| strs.length==0)  return new ArrayList<>();
    Map<String,List<String>> map=new HashMap<>();
    for(String s:strs)
    {
        char[] ca=new char[26];
        for(char c:s.toCharArray()) ca[c-'a']++;
        String keyStrs=String.valueOf(ca);
        if(!map.containsKey(keyStrs)){
            map.put(keyStrs, new ArrayList<>());

        }
        map.get(keyStrs).add(s);
    }

    return new ArrayList<>(map.values());





    //     List<List<String>> list=new ArrayList<>();

    //     List<String> list2=new ArrayList<>();
    //     for(int i=0;i<strs.length-1;i++)
    //     {
    //         int j=i+1;
    //         while(j<strs.length)
    //         {
    //             if(anagram(strs[i],strs[j]))
    //             {
    //                   if(!list2.contains(strs[i]))
    //                 list2.add(strs[i]);
    //                 if(!list2.contains(strs[j])){
    //                 list2.add(strs[j]);}
    //                 // j++;
    //             }
    //             j++;
    //         }
    //         //if(!list2.contains())
    //         list.add(list2);

    //     }
    //     return list;
    // }

    // public boolean anagram(String s, String t)
    // {
    //    int[] arr=new int[26];
    //    for(int i=0;i<s.length();i++){
    //     arr[s.charAt(i)-'a']++;
    //    }
    //    for(int i=0;i<t.length();i++)
    //    {
    //     arr[t.charAt(i)-'a']--;
    //    }
    //    for(int i:arr)
    //    {
    //     if(i!=0) return false;
    //    }
    //    return true;
     }
}