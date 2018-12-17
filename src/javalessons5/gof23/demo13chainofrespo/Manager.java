package javalessons5.gof23.demo13chainofrespo;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if (lr.getDays() >= 3 && lr.getDays() < 10) {
			System.out.println("manager: " + lr.getName() + " Çë¼ÙÌìÊý£º" + lr.getDays());
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(lr);
			}
		}

	}

}
