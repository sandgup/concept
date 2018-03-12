package collection;

public class StackTest {
	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		for (int i = 0; i < 2; i++) {
			stack.push(i);
		}
		stack.prinStack(stack.headNode);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}

class Stack {

	Node headNode;

	Node tailNode;

	void prinStack(final Node headNode) {
		Node temp = headNode;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}

	}

	public void push(int num) {
		Node n = new Node();
		n.data = num;
		n.nextNode = null;
		if (tailNode == null) {
			headNode = n;
			tailNode = headNode;

		} else {
			tailNode.nextNode = n;
			tailNode = n;
		}
	}

	public int pop() throws Exception {
		if (tailNode != null) {
			Node temp = headNode;
			Node before = null;
			while (temp.nextNode != null) {
				before = temp;
				temp = temp.nextNode;

			}
		
			if (before == null) {
				tailNode = before;
				headNode = before;
			} else {
				tailNode = before;
				tailNode.nextNode = null;
			}
			return temp.data;
		}
		throw new Exception("empty statck");
	}

}

class Node {
	int data;
	Node nextNode;
}