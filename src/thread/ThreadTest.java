package thread;

import java.util.Stack;

public class ThreadTest {
	public static void main(String[] var) {
		Stack<Integer> statck=new  Stack<>();
		;
		Thread producerThread = new Thread(new Producer(val));
		producerThread.start();

		Thread consumerThread = new Thread(new Consumer(val));
		consumerThread.start();

	}

}

class Producer implements Runnable {
	public Producer(Integer val) {
		this.val = val;
	}

	Integer val;

	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			val = i;
			System.out.println("producer value is  " + val);
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {
	public Consumer(Integer val) {
		this.val = val;
	}

	Integer val;

	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			System.out.println("consumer value is  " + val);
		}

	}
}
