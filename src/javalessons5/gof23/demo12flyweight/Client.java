package javalessons5.gof23.demo12flyweight;

public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess = ChessFlyWeightFactory.getChess("black");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("black");
		chess.display(new Coordinate(1, 1));
		chess2.display(new Coordinate(2, 1));
		System.out.println(chess + " " + chess2);
	}
}
