class Solution {
    public int totalNQueens(int n) {
        int allpositions=(1<<n)-1;
        return backtrack(allpositions,0,0,0);
    }
     private int backtrack(int allpositions, int columns, int daigonal1,int daigonal2)
     {
        if(columns==allpositions)
        {
            return 1;
        }
        int available=allpositions&~(columns|daigonal1|daigonal2);
        int count=0;
        while(available!=0)
        {
            int position=available& - available;
            available-=position;
            count+=backtrack(allpositions, columns|position,
            (daigonal1|position)<<1,
            (daigonal2|position)>>1);

        }
        return count;
     }
}