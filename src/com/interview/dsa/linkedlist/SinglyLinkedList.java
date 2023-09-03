package com.interview.dsa.linkedlist;


public class SinglyLinkedList {
	ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		ListNode(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public void display() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data + "-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public int length() {
		if(head==null) {
			return 0;
		}
		int count = 0 ;
		ListNode current = head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current = head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	
	public void insert(int position,int value) {
		ListNode node = new ListNode(value);
		if(position==1) {
			node.next=head;
			head=node;
		}else {
			ListNode previous = head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current = previous.next;
			node.next=current;
			previous.next=node;
		}
	}
	
	public ListNode deleteFirst() {
		if(head==null) {
			return null;
		}
		ListNode temp = head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	
	public ListNode deleteLast() {
		if(head==null || head.next==null) {
			return head;
		}
		ListNode current=head;
		ListNode previous=null;
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		previous.next=null;
		return current;
	}
	
	public void delete(int position) {
		if(position==1) {
			head=head.next;
		}else {
			ListNode previous = head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next=current.next;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
//		sll.head  = new ListNode(10);
//		ListNode second = new ListNode(20);
//		ListNode third = new ListNode(30);
//		ListNode forth = new ListNode(40);
//		
//		sll.head.next = second; // 10--20
//		second.next = third;// 10--20--30
//		third.next = forth;// 10--20--30--40--null
		
//		sll.insertFirst(11);
//		sll.insertFirst(8);
//		sll.insertFirst(1);
		
		sll.insertLast(11);
		sll.insertLast(8);
		sll.insertLast(1);
		sll.insertLast(14);
		
		sll.insert(1, 12);//12--null
		sll.insert(2, 22);//12--22--null
		sll.insert(1, 32);//32--12--22--null
		sll.insert(1, 42);//42--32--12--22--null
		sll.insert(3, 152);//42--32--152--12--22--null
		sll.display();
		System.out.println("Length is  -> "+sll.length());
//		System.out.println(sll.deleteFirst().data);
//		sll.display();
//		System.out.println(sll.deleteFirst().data);
//		sll.display();
		
//		System.out.println(sll.deleteLast().data);
//		sll.display();
//		System.out.println(sll.deleteLast().data);
//		sll.display();
		
		sll.delete(1);
		sll.display();
		sll.delete(4);
		sll.display();
	}

}
