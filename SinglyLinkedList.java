package singlylinkedlist;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class SinglyLinkedList {

	Node head;

	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println("Inserted at beginning.");
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			System.out.println("Inserted at end.");
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		System.out.println("Inserted at end.");
	}

	public void insertAtGivenPostion(int data, int pos) {
		if (pos <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range!");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Inserted at position " + pos);
	}

	public void deleteAtBeginning() {
		if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        head = head.next;
        System.out.println("Deleted from beginning.");

	}

	public void deleteAtEnd() {
		if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        System.out.println("Deleted from end.");

	}

	public void deleteAtGivenPostion(int pos) {
		 if (head == null) {
	            System.out.println("List is empty!");
	            return;
	        }

	        if (pos <= 0) {
	            System.out.println("Invalid position!");
	            return;
	        }

	        if (pos == 1) {
	            deleteAtBeginning();
	            return;
	        }

	        Node temp = head;

	        for (int i = 1; i < pos - 1; i++) {
	            if (temp.next == null) {
	                System.out.println("Position out of range!");
	                return;
	            }
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Position out of range!");
	            return;
	        }

	        temp.next = temp.next.next;
	        System.out.println("Deleted from position " + pos);
	            

	}

	public void displayList() {
		Node temp = head;

		if (temp == null) {
			System.out.println("List is Empty...!!!");
			return;
		}

		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
}
