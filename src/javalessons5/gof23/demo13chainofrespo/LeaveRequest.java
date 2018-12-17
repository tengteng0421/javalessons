package javalessons5.gof23.demo13chainofrespo;

/**
 * 请假的基本信息
 * 
 * @author Teng-Dell
 *
 */
public class LeaveRequest {
	private String name;
	private int days;
	private String reason;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LeaveRequest() {
		super();
	}

}
