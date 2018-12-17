package javalessons5.gof23.demo14iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregate c = new ConcreteMyAggregate();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		MyIterator iterator = c.createIterator();
		System.out.println(iterator.isFirst() + " " + iterator.isLast());
		iterator.next();
		System.out.println(iterator.isFirst() + " " + iterator.isLast());
		iterator.next();
		System.out.println(iterator.isFirst() + " " + iterator.isLast());
		iterator.next();
		System.out.println(iterator.isFirst() + " " + iterator.isLast());
		iterator.next();
		System.out.println(iterator.isFirst() + " " + iterator.isLast());
		iterator.next();
		System.out.println(iterator.isFirst() + " " + iterator.isLast());
	}
}
