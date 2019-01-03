package javalessons5.gof23.demo17strategy;

/**
 * ����;���Ĳ�������н����������㷨��ֱ�ӵĿͻ��˵��÷����ˣ�ʹ���㷨�����ڿͻ��˶����ı仯�����ʹ��spring������ע�빦�ܣ�������ͨ�������ļ���
 * ��̬���л���ͬ���㷨
 * 
 * @author Teng-Dell
 *
 */
public class Context {
	private StrategyInterface strategy;

	public Context(StrategyInterface strategy) {
		super();
		this.strategy = strategy;
	}

	public void price(double s) {
		System.out.println("price:" + strategy.getPrice(s));
	}
}
