package javalessons5.gof23.demo13chainofrespo;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if (lr.getDays() >= 10 && lr.getDays() < 30) {
			System.out.println("generalManager: " + lr.getName() + " 请假天数：" + lr.getDays());
		} else {
			System.out.println("天数太长了");
		}

	}

}
