package javalessons1.threadtest.test2;

public class InterRunnable implements Runnable {
	private String str;

	/**
	 * ����ʹ�ü̳нӿ�
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
		// ����ֻʹ��һ��ʱ��������������
		new Thread(new InterRunnable("����")).start();
		new Thread(new InterRunnable("ѧϰ")).start();
		new Thread(new InterRunnable("������")).start();
		// �ڶ��ַ�ʽ
		InterRunnable i = new InterRunnable("����Ϸ");
		Thread t = new Thread(i);
		t.start();

	}

}
