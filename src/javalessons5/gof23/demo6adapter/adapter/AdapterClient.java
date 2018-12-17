package javalessons5.gof23.demo6adapter.adapter;

/**
 * �ͻ��࣬�൱�ڱʼǱ���ֻ��usb�ӿ�
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
