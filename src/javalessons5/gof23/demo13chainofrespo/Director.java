package javalessons5.gof23.demo13chainofrespo;

public class Director extends Leader {

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if (lr.getDays() < 3) {
			System.out.println("director: " + lr.getName() + " Çë¼ÙÌìÊý£º" + lr.getDays());
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(lr);
			}
		}

	}

}
