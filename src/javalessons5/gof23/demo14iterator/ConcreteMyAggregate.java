package javalessons5.gof23.demo14iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<>();

	public void add(Object o) {
		list.add(o);
	}

	public MyIterator createIterator() {
		return new ConcreteIterator();
	}

	private class ConcreteIterator implements MyIterator {

		private int cursor;

		@Override
		public void first() {
			cursor = 0;

		}

		@Override
		public void next() {
			if (cursor < list.size() - 1) {
				cursor++;
			}

		}

		@Override
		public boolean hasNext() {
			return cursor < list.size();
		}

		@Override
		public boolean isFirst() {
			return cursor == 0;
		}

		@Override
		public boolean isLast() {
			return cursor == list.size() - 1;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}

	}
}
