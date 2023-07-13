package day04.practice;

class RectanglePractice {
	protected int length;
	protected int breadth;

	public RectanglePractice() {

	}

	public RectanglePractice(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;

	}

	public int getLength() {
		return length;
	}

	public int setLength(int length) {
		 this.length = length;
		 return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int calculateArea(int length, int breadth) {
		return length * breadth;
	}

}

class Square extends RectanglePractice {
	public Square() {
		
	}

	public Square(int l,int b) {
		super(l, b);
	}
	
	public Square(int length) {
		this.length = length;
	}
	
}

public class Rectangle {
	public static void main(String[] args) {
		Square square = new Square();
		int length = square.setLength(10);
		int area = square.calculateArea(length,3);
		System.out.println("Length : " + length);
		System.out.println("Area : " + area);

	}
}
