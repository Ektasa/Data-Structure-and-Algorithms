class Solution {
    public int secondHighest(String s) {
        
   
        int n1=-1;
        int n2=-1;

        for(char n:s.toCharArray())
        {
            if(Character.isDigit(n)){
            if(n>n1)
            {
                n2=n1;
                n1=n;
            }
            else if(n!=n1 && n>n2)
            {
                n2=n;
            }
        }
        }
       return n2==-1 ? -1 :n2-'0';
    }
}