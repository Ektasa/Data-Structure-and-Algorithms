class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> ll=new ArrayList<Integer>();
     backtrack(1,n,k,list,ll);

        
        return list;
    }

    public List<List<Integer>> backtrack(int st, int n, int k,List<List<Integer>> res, List<Integer> addr)
    {
        if(addr.size()==k)
        {
            res.add(new ArrayList<>(addr));
            return res;
        }
        int r=k-addr.size();
        for(int i=st;i<=n-r+1;i++)
        {
            addr.add(i);
            backtrack(i+1,n,k,res,addr);
            addr.remove(addr.size()-1);
        }
        return res;
    }
}