package javalessons1.threadtest.test1;

public class ThreadStart extends Thread {

	public static int i = 90;
	public static int flag = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int result = -1;
		int count = 0;
		while (result != i) {
			count++;
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result = (int) (Math.random() * 100);
		}
		if (flag == 0) {
			flag = 1;
			System.out.println("thread win " + count);
		} else {
			System.out.println("thread lose " + count);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadStart t = new ThreadStart();
		t.start();
		int result = -1;
		int count = 0;
		while (result != i) {
			count++;
			Thread.sleep(5);
			result = (int) (Math.random() * 50) + 50;
		}
		if (flag == 0) {
			flag = 2;
			System.out.println("main win " + count);
		} else {
			System.out.println("main lose " + count);
		}
	}

}
