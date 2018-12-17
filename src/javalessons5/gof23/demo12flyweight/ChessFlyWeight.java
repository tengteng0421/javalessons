package javalessons5.gof23.demo12flyweight;

/**
 * ÏíÔªÀà
 * 
 * @author Teng-Dell
 *
 */
public interface ChessFlyWeight {
	void setColor(String color);

	String getColor();

	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight {
	private String color;

	@Override
	public void setColor(String color) {
		this.color = color;

	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("color: " + color);
		System.out.println("weizhi: " + c.getX() + " " + c.getY());

	}

}
