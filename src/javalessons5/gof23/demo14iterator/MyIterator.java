package javalessons5.gof23.demo14iterator;

public interface MyIterator {
	void first();// ���α�ָ���һ��

	void next();// ���α�ָ����һ��

	boolean hasNext();// �ж��Ƿ������һ��Ԫ��

	boolean isFirst();

	boolean isLast();

	Object getCurrentObj();
}
