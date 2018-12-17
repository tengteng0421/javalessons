package javalessons5.gof23.demo13chainofrespo;

public class Client {
	public static void main(String[] args) {
		Leader d = new Director("d");
		Leader m = new Manager("m");
		Leader g = new GeneralManager("g");
		Leader v = new ViceGeneralManager("v");
		d.setNextLeader(m);
		m.setNextLeader(v);
		v.setNextLeader(g);
		LeaveRequest l = new LeaveRequest();
		l.setName("teng");
		l.setDays(31);
		l.setReason("123456");
		d.handleRequest(l);
	}
}
