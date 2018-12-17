package javalessons5.gof23.demo6adapter.adapter;

/**
 * 适配器类，相当于usb和ps/2的转接器
 * 
 * 继承方式，不灵活
 * 
 * @author Teng-Dell
 *
 */
public class Adapter extends Adapatee implements Target {

	@Override
	public void handleReq() {
		request();

	}

}
