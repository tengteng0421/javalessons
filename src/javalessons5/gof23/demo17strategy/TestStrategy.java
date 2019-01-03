package javalessons5.gof23.demo17strategy;

public class TestStrategy {
	public static void main(String[] args) {
		StrategyInterface strategy = new OldCustomerManyStrategy();
		Context ctx = new Context(strategy);
		ctx.price(999);
	}
}
