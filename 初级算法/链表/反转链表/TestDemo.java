package tesk.LinkedList;

import java.util.ArrayList;
import java.util.List;

/*
 *反转链表
 *反转一个单链表。
 *
 *示例:
 *输入: 1->2->3->4->5->NULL
 *输出: 5->4->3->2->1->NULL
 *
 *进阶:
 *你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
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
		new TestDemo().reverseList(head).showAll();
		
	}
	public ListNode reverseList(ListNode head) {
		//增加头节点
		if(head == null) return null;
		ListNode last = new ListNode(0);
		last.next = head;
		head = last;
		last = head.next;
		//开始循环
		while(last.next != null) {
			//将要移动的节点取出
			ListNode temp = last.next;
			last.next = temp.next;
			//放入头节点后
			temp.next = head.next;
			head.next = temp;
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
