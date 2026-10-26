class Solution {
    static class TrieNode{
        TrieNode[] ch =new TrieNode[26];
        boolean isW=false;
    }
    private void insert(TrieNode root, String word){
        TrieNode node = root;
        for(char c:word.toCharArray()){
            int idx = c -'a';
            if(node.ch[idx]==null){
                node.ch[idx]=new TrieNode();
            }
            node =node.ch[idx];
        }
        node.isW=true;
    }
    public int minExtraChar(String s, String[] dictionary) {
        //trie approach 
        int n = s.length();
        TrieNode root = new TrieNode();
        for(String word:dictionary){
            insert(root,word);
        }
        int dp[] = new int[n+1];
        for(int i=n-1;i>=0;i--){
            dp[i]=dp[i+1]+1;
            TrieNode node = root;
            for(int j =i;j<n;j++){
                int idx = s.charAt(j)-'a';
                if(node.ch[idx]==null){
                    break;
                }
                node = node.ch[idx];
                if(node.isW){
                    dp[i]= Math.min(dp[i],dp[j+1]);
                }
            }
        }
        return dp[0];

    }
}