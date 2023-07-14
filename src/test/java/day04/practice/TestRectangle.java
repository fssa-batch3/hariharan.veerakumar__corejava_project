package day04.practice;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestRectangle {
	
	public static void main(String[] args) {
		  Square square = new Square(5.0);
	        double length = square.getLength();
	        double area = square.calculateArea();
		
	}
	
	@Test
	public void testGettersSetters() {
		  Square square = new Square(5.0);
	        double length = square.getLength();
	        double area = square.calculateArea();
		
		assertEquals(5.0,square.getLength());
		assertEquals(25.0,square.calculateArea());
	}

}
