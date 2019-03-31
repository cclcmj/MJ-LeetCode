package app;
/**
 *合并两个有序链表
 *
 *将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *示例：
 *输入：1->2->4, 1->3->4
 *输出：1->1->2->3->4->4
 */
public class App {
    public static void main(String[] args) throws Exception {
        ListNode l1 = new ListNode(1);
        ListNode temp = l1;
        for(int i = 2;i < 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode l2 = new ListNode(1);
        temp = l2;
        for(int i = 2;i < 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode result = (new App()).mergeTwoLists(l1,l2);
        temp = result;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);//头节点
        ListNode posR = result;
        while(l1 != null || l2 != null) {
            if((l1 != null && l2 != null && l1.val <= l2.val) || (l1 != null && l2 == null)) {
                posR.next = l1;
                l1 = l1.next;
            }else if((l1 != null && l2 != null && l2.val < l1.val) || (l2 != null && l1 == null)){
                posR.next = l2;
                l2 = l2.next;
            } 
            posR = posR.next;
        }
        return result.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}