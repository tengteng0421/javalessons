package javalessons5.gof23.demo14iterator;

public interface MyIterator {
	void first();// 将游标指向第一个

	void next();// 将游标指向下一个

	boolean hasNext();// 判断是否存在下一个元素

	boolean isFirst();

	boolean isLast();

	Object getCurrentObj();
}
