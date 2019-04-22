package app;
/**
 *环形链表
 *给定一个链表，判断链表中是否有环。
 *为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 
 *如果 pos 是 -1，则在该链表中没有环。
 */
public class App {
    public static void main(String[] args) throws Exception {
        ListNode l1 = new ListNode(1);
        ListNode temp = l1;
        
        for(int i = 2;i < 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        temp = l1;
        while(temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
        l1.next.next.next.next=l1;
        System.out.println(new App().hasCycle(l1));
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)return false;
        ListNode slow = new ListNode(0);
        ListNode fast = new ListNode(0);
        slow.next=head;
        fast.next=head;
        while(slow != fast) {
            if(fast.next == null || fast.next.next == null || fast.next.next.next == null)return false;
            fast = fast.next.next.next;
            slow = slow.next;
        }
        return true;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}