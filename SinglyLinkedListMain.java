package singlylinkedlist;

import java.util.Scanner;

public class SinglyLinkedListMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SinglyLinkedList sl = new SinglyLinkedList();

		while (true) {
			System.out.println("Enter your choice");

			System.out.println("1.Insert Node");
			System.out.println("2.Delete Node");
			System.out.println("3.Display List");
			System.out.println("4.Exit");

			int ch = scan.nextInt();

			switch (ch) {
			case 1: {
				System.out.println("Insert node in Singly Linked List");
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");

				System.out.println("Enter your choice where to insert");
				System.out.println("----------------------------------");
				while (true) {
					System.out.println("1.Insert At Beginning");
					System.out.println("2.Insert At End");
					System.out.println("3.Insert At Given Postion");
					System.out.println("4.Back to Main Menu");
					int ch1 = scan.nextInt();
					switch (ch1) {
					case 1: {
						System.out.println("Enter data to insert into list at beginning");
						int data = scan.nextInt();
						sl.insertAtBeginning(data);
					}
						break;

					case 2: {
						System.out.println("Enter data to insert into list at end");
						int data = scan.nextInt();
						sl.insertAtEnd(data);
					}
						break;

					case 3: {
						System.out.println("Enter postion in the list where to insert data");
						int pos = scan.nextInt();
						System.out.println("Enter data to insert into list");
						int data = scan.nextInt();
						sl.insertAtGivenPostion(data, pos);
					}
						break;

					case 4:
						break;

					default:
						System.out.println("Invalid Choice!!!");
					}
					if (ch1 == 4)
						break;

				}
			}

				break;

			case 2: {
				System.out.println("Delete node in Singly Linked List");
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");

				System.out.println("Enter your choice to delete");
				System.out.println("----------------------------------");
				while (true) {
					System.out.println("1.Delete At Beginning");
					System.out.println("2.Delete At End");
					System.out.println("3.Delete At Given Postion");
					System.out.println("4.Back to Main Menu");
					int ch1 = scan.nextInt();
					switch (ch1) {
					case 1: {

						sl.deleteAtBeginning();
					}
						break;

					case 2: {
						sl.deleteAtEnd();
					}
						break;

					case 3: {
						System.out.println("Enter position in the list where to delete");
						int pos = scan.nextInt();
						sl.deleteAtGivenPostion(pos);
					}
						break;

					case 4:
						break;

					default:
						System.out.println("Invalid Choice!!!");
					}
					if (ch1 == 4)
						break;

				}
			}

				break;

			case 3: {

				System.out.println("-----Element in the List--------");
				sl.displayList();

			}
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("Invalid Choice!!!");
			}
		}

	}

}
