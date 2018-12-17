package javalessons1.threadtest.test2;

public class InterRunnable implements Runnable {
	private String str;

	/**
	 * 优先使用继承接口
	 * 
	 * @param str
	 */
	public InterRunnable(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		System.out.println(str);// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// 对象只使用一次时，可以用匿名类
		new Thread(new InterRunnable("听歌")).start();
		new Thread(new InterRunnable("学习")).start();
		new Thread(new InterRunnable("看电视")).start();
		// 第二种方式
		InterRunnable i = new InterRunnable("玩游戏");
		Thread t = new Thread(i);
		t.start();

	}

}
