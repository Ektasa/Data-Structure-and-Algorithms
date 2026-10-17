class Solution {
    public int reverse(int x) {
        int res=0; int r=x;
        if(x<0){
            x=x*-1;
        }
        while(x!=0)
        {
            int t=x%10;
        if(res>Integer.MAX_VALUE/10 ||(res==Integer.MAX_VALUE && res>7))
        {
            return 0;
        }
        if(res<Integer.MIN_VALUE/10 ||(res==Integer.MIN_VALUE && res<-8))
        {
            return 0;
        }

            res=res*10+t;
            x=x/10;
        }
        if(r<0)
        {
            res=res*-1;
        }
        return res;
    }
}