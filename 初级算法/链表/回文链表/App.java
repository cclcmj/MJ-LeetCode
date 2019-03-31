package app;
/**
 *回文链表
 *请判断一个链表是否为回文链表。
 *
 *示例 1:
 *输入: 1->2
 *输出: false
 *
 *示例 2:
 *输入: 1->2->2->1
 *输出: true
 *
 *进阶：
 *你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class App {
    public static void main(String[] args) throws Exception {
        ListNode l1 = new ListNode(2);
        ListNode temp = l1;
        
        for(int i = 2;i < 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        for(int i = 4;i > 0; i--) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        
        temp = l1;
        while(temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
        System.out.println(new App().isPalindrome(l1));
    }
    public boolean isPalindrome(ListNode head) {
        StringBuffer result = new StringBuffer("");
        ListNode pos = head;
        while(pos != null) {
            result.append(String.valueOf(pos.val) + ",");
            pos = pos.next;
        }
        String[] strs = result.toString().split(",");
        for(int i = 0;i < strs.length/2; i++) {
            if(!strs[i].equals(strs[strs.length-1-i]))
                return false;
        }
        return true;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}