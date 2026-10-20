class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        if(s.length()!=goal.length()) return false;
        String join=s+s;
        if(join.contains(goal))
        {return true;}
        

        return false;
        
    }
}