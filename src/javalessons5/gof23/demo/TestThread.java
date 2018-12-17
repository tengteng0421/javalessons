package javalessons5.gof23.demo;

import java.util.concurrent.CountDownLatch;

/**
 * ���Ե�����Ч��
 * 
 * @author Teng-Dell
 *
 */
public class TestThread {
	/*
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		final CountDownLatch cdl = new CountDownLatch(10);
		for (int i = 0; i < 100; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					for (int i = 0; i < 100000; i++) {
						Object instance = SingletonDemo2.getInstance();
					}
					cdl.countDown();
				}
			}).start();
		}
		// main�߳�������֪����������Ϊ0���ż���ִ��
		cdl.await();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
