package link1;

import java.util.Scanner;

public class LL {

	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void creation() {
		int data, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter data");
			data = sc.nextInt();

			Node new_node = new Node(data);
			if (head == null) {
				head = new_node;
			} else {
				new_node.next = head;
				head = new_node;
			}
			System.out.println("do you want to add more data if yes press 1");
			n = sc.nextInt();

		} while (n == 1);

	}

	public void traversal() {
		
		Node temp=head;
		if(head==null) {
			System.out.println("ll does not exist");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data + " ");
				
				temp=temp.next;
			}
			
		}
		
		

	}

	public static void main(String args[]) {
		LL l1 = new LL();
		l1.creation();
		l1.traversal();

	}
}
