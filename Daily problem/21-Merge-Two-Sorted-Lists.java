/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode f=list1; 
         ListNode s=list2;
         ListNode res=new ListNode(0);

         while(f!=null && s!=null)
         {
            if(f.val<s.val)
            {
                insert(f.val,res);
                f=f.next;
            }
            else
            {
                insert(s.val,res);
                s=s.next;
            }
         }
         while(f!=null)
         {
            insert(f.val,res); f=f.next;
         }
         while(s!=null)
         {
            insert(s.val, res);
            s=s.next;
         }
         return res.next;
    }
    public static void insert(int val, ListNode temp)
    {
        ListNode n=new ListNode(val);
      //  ListNode cur
        while(temp!=null)
        {
            if(temp.next==null)
            {
                temp.next=n;
                n.next=null;
                
            }
            temp=temp.next;

        }
    }
}