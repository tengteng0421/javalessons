package javalessons5.gof23.demo6adapter.adapter;

/**
 * �������࣬�൱��usb��ps/2��ת����
 * 
 * �̳з�ʽ�������
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
