package javalessons5.gof23.demo7proxy.staticproxy;

public class ProxyClient {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		Star proxyStar = new ProxyStar(realStar);
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.bookTicket();
		proxyStar.sing();
		proxyStar.collectMoney();
	}
}
