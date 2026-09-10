class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0)
        {return res;}

        Map<Character, String> digit2let=new HashMap<>();
        digit2let.put('2',"abc");
        digit2let.put('3',"def");
        digit2let.put('4',"ghi"); 
        digit2let.put('5',"jkl");
        digit2let.put('6',"mno");
        digit2let.put('7',"pqrs");
        digit2let.put('8',"tuv");
        digit2let.put('9',"wxyz");

        backtrack(digits,0, new StringBuilder(), res, digit2let);
        return res;

    }
    private void backtrack(String digits, int idx, StringBuilder comb,List<String> res, Map<Character, String> digit2let)
    {
        if(idx==digits.length())
        {res.add(comb.toString()); return;}

        String letters=digit2let.get(digits.charAt(idx));
        for(char letter:letters.toCharArray())
        { comb.append(letter);
            backtrack(digits,idx+1, comb, res, digit2let);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}