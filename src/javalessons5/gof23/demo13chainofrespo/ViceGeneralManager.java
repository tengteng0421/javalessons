package javalessons5.gof23.demo13chainofrespo;

public class ViceGeneralManager extends Leader {

	public ViceGeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if (lr.getDays() >= 10 && lr.getDays() < 20) {
			System.out.println("ViceGeneralManager: " + lr.getName() + " Çë¼ÙÌìÊý£º" + lr.getDays());
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(lr);
			}
		}

	}

}
