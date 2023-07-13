package day04.practice;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestRectangle {
	
	public static void main(String[] args) {
		Square square = new Square();
		int length = square.setLength(10);
		int area = square.calculateArea(length,3);
		System.out.println("Length : " + length);
		System.out.println("Area : " + area);
		
	}
	
	@Test
	public void testGettersSetters() {
		Square square = new Square();
		int length = square.setLength(10);
		int area = square.calculateArea(length,3);
		
		assertEquals(10,square.setLength(10));
		assertEquals(30,square.calculateArea(length, 3));
	}

}
