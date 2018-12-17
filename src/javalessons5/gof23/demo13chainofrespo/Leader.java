package javalessons5.gof23.demo13chainofrespo;

public abstract class Leader {
	protected String name;
	protected Leader nextLeader;

	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	public Leader(String name) {
		super();
		this.name = name;
	}

	public abstract void handleRequest(LeaveRequest lr);
}
