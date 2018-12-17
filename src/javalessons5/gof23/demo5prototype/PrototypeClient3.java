package javalessons5.gof23.demo5prototype;

import java.io.IOException;

public class PrototypeClient3 {
	/**
	 * 模拟构造方法很耗时，使用原型的对比
	 * 
	 * @param args
	 * @throws CloneNotSupportedException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			test t = new test();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		test t = new test();
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			Object t1 = t.clone();
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}

class test implements Cloneable {
	public test() {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}