package javalessons5.gof23.demo17strategy;

public class NewCustomerManyStrategy implements StrategyInterface {

	@Override
	public double getPrice(double standardPrice) {
		// TODO Auto-generated method stub
		return standardPrice * 0.9;
	}

}
