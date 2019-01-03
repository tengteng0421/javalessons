package javalessons5.gof23.demo17strategy;

/**
 * 负责和具体的策略类进行交互。具体算法和直接的客户端调用分离了，使得算法独立于客户端独立的变化。如何使用spring的依赖注入功能，还可以通过配置文件，
 * 动态的切换不同的算法
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
