package tesk.LinkedList;

import java.util.ArrayList;
import java.util.List;

/*
 *删除链表的倒数第N个节点
 *给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 *示例：
 *给定一个链表: 1->2->3->4->5, 和 n = 2.
 *当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 *说明：
 *给定的 n 保证是有效的。
 *进阶：
 *你能尝试使用一趟扫描实现吗？
 */

class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode temp = head;
		for(int i = 2;i < 6;i++) {
			temp.next = new ListNode(i);
			temp = temp.next;
		}
		head.showAll();
		new TestDemo().removeNthFromEnd(head, 2).showAll();
		
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode prev = head;
		ListNode last = head;
		head = new ListNode(0);//增加头节点
		head.next = prev;
		prev = last = head;
		int k = 0;
		if(head.next == null) head = null;
		else {
			while(k != n) {
				last = last.next;
				k++;
			}
			while(last.next != null) {
				prev = prev.next;
				last = last.next;
			}
			prev.next = prev.next.next;
		}
		return head.next;
	}
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	void showAll() {
		ListNode temp = this;
		while(temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}
	}
}
