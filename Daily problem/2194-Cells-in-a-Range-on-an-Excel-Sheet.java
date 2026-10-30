class Solution {
    public List<String> cellsInRange(String s) {
        

        char cs=s.charAt(0),ce=s.charAt(3);
        char rs=s.charAt(1), re=s.charAt(4);

        List<String> ls=new ArrayList<>();

        for(char c=cs; c<=ce;c++)
        {
            for(char r=rs;r<=re;r++)
            {
                ls.add(new String(new char[]{c,r}));
            }
        }
        return ls;
    }
}