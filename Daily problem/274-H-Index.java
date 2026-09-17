class Solution {
    public int hIndex(int[] citations) {
            int sum=0; int n=citations.length;
            int h=0; Arrays.sort(citations);
        for(int i=0;i<citations.length;i++)
        {
            int paper=n-i;
            if(citations[i]>=paper){
                h=paper;break;
            }
            
        }
        return h;
    }
}