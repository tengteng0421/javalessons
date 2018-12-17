package javalessons5.gof23.demo9composite;

public interface Component {
	void operation();

}

interface Leaf extends Component {

}

interface Composite extends Component {
	void add(Component c);

	void remove(Component c);

	Component getChild(int index);
}
