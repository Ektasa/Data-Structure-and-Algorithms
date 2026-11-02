class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(k);
        int[][] pre=new int[matrix.length+1][matrix[0].length+1];

        for(int i=1;i<pre.length;i++)
        {
          
          for(int j=1;j<pre[i].length;j++)
          {
            pre[i][j]=matrix[i-1][j-1]
            ^pre[i-1][j]^pre[i][j-1]^pre[i-1][j-1];

            pq.add(pre[i][j]);
            if(pq.size()>k)
            {
                pq.poll();
            }
          }
        }
          return pq.peek();
        }
        
    
}