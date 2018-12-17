package javalessons5.gof23.demo6adapter.adapter;

/**
 * 适配器类，相当于usb和ps/2的转接器
 * 
 * 对象适配方式，使用了组合的方式跟被适配的对象整合
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
