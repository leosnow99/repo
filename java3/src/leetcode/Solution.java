package leetcode;
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode root=new ListNode(0);
        ListNode rear = root;
        int carry=0;
        if (l1==null)
            return l2;
        if(l2==null)
            return l1;
        while((l1!=null)&&(l2!=null)){
            int rem=(l1.val+l2.val+carry)%10;
            ListNode node=new ListNode(rem);
            rear.next=node;
            carry=(l1.val+l2.val+carry)/10;
            rear=node;
            l1=l1.next;
            l2=l2.next;
        }
        if (l1==null)
            rear.next=l2;
        else
            rear.next=l1;
        if(carry==1){
            while(rear.next!=null){
                int sum=(rear.next.val+carry);
                rear.next.val=sum%10;
                carry=sum/10;
                rear=rear.next;
            }
            if(carry==1){
                rear.next=new ListNode(1);
            }
        }
        return root.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l1.next =  l12;
        l12.next = l13;
        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;
        Solution s = new Solution();
        ListNode result = s.addTwoNumbers(l1, l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
