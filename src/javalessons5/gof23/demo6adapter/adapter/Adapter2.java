package javalessons5.gof23.demo6adapter.adapter;

/**
 * �������࣬�൱��usb��ps/2��ת����
 * 
 * �������䷽ʽ��ʹ������ϵķ�ʽ��������Ķ�������
 * 
 * @author Teng-Dell
 *
 */
public class Adapter2 implements Target {
	private Adapatee adaptee;

	public Adapter2(Adapatee adapatee) {
		this.adaptee = adapatee;
	}

	@Override
	public void handleReq() {
		adaptee.request();

	}

}
