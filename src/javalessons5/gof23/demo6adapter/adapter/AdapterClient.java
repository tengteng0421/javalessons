package javalessons5.gof23.demo6adapter.adapter;

/**
 * 客户类，相当于笔记本，只有usb接口
 * 
 * @author Teng-Dell
 *
 */
public class AdapterClient {
	public void test1(Target t) {
		t.handleReq();
	}

	public static void main(String[] args) {
		AdapterClient c = new AdapterClient();
		Adapatee a = new Adapatee();
		Target t = new Adapter();
		c.test1(t);

		Target t2 = new Adapter2(a);
		c.test1(t2);
	}
}
