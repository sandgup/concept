package collection;

public class SingleLinkListTest {
	public static void main(String[] a) {
		SingleLinkList linkList = new SingleLinkList();
		for (int i = 0; i < 8; i++) {
			linkList.add(i);
		}
		linkList.printList();
		linkList.reverseList();
		linkList.printList();
	}
}

class SingleListNode {
	int data;
	SingleListNode nextNode;;
}

class SingleLinkList {

	SingleListNode headNode;

	void printList() {
		System.out.println("------------");
		SingleListNode temp = headNode;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
	}

	void add(int num) {

		SingleListNode newNode = new SingleListNode();
		newNode.data = num;
		newNode.nextNode = null;
		if (headNode == null) {
			headNode = newNode;
			return;
		}

		SingleListNode temp = headNode;
		while (temp.nextNode != null) {
			temp = temp.nextNode;
		}
		temp.nextNode = newNode;
	}

	void reverseList() {
		SingleListNode before = null;
		while (headNode != null) {
			SingleListNode next = headNode.nextNode;
			headNode.nextNode = before;
			before = headNode;
			headNode = next;

		}
		headNode = before;

	}
}
