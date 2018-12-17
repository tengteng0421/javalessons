package javalessons5.gof23.demo12flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * 
 * @author Teng-Dell
 *
 */
public class ChessFlyWeightFactory {
	private static Map<String, ChessFlyWeight> map = new HashMap<>();

	public static ChessFlyWeight getChess(String color) {
		if (map.get(color) != null) {
			return map.get(color);
		} else {
			ChessFlyWeight chess = new ConcreteChess(color);
			map.put(color, chess);
			return chess;
		}
	}
}
