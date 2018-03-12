package collection;

public class DoubleLinkListTest {
	public static void main(String[] var) {
		DoubleLinkList doubleLinkList = new DoubleLinkList();
		for (int i = 1; i < 4; i++) {
			doubleLinkList.Add(i);
		}
		doubleLinkList.printList(doubleLinkList.headNode);
		// System.out.println(doubleLinkList.delete(1));
		System.out.println(doubleLinkList.delete(3));
		System.out.println(doubleLinkList.delete(2));
		System.out.println(doubleLinkList.delete(2));
		System.out.println(doubleLinkList.delete(2));
	}

}

class DoubleLinkListNode {
	int data;
	DoubleLinkListNode prevNode;
	DoubleLinkListNode nextNode;
}

class DoubleLinkList {

	DoubleLinkListNode headNode;

	void printList(DoubleLinkListNode node) {
		DoubleLinkListNode temp = node;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}

	}

	void Add(int num) {
		DoubleLinkListNode doubleLinkListNode = new DoubleLinkListNode();
		doubleLinkListNode.data = num;
		doubleLinkListNode.nextNode = null;
		doubleLinkListNode.prevNode = null;
		if (headNode == null) {
			headNode = doubleLinkListNode;
		} else {
			DoubleLinkListNode temp = headNode;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = doubleLinkListNode;
			doubleLinkListNode.prevNode = temp;
		}

	}

	public int delete(int position) {
		int count = 1;

		if (headNode == null) {
			return -1;
		}
		DoubleLinkListNode temp = headNode;
		while (count != position && temp.nextNode != null) {
			temp = temp.nextNode;
			count++;

		}
		if (count != position) {
			return -1;
		}
		if (temp.prevNode == null && temp.nextNode == null) {
			return temp.data;
		}
		if (temp.prevNode == null) {
			temp.nextNode.prevNode = null;
			headNode = temp.nextNode;
		} else {
			if (temp.nextNode != null)
				temp.nextNode.prevNode = temp.prevNode;
		}
		if (temp.nextNode == null) {
			temp.prevNode.nextNode = null;
		} else {
			if (temp.prevNode != null)
				temp.prevNode.nextNode = temp.nextNode;
		}

		return temp.data;

	}

}
