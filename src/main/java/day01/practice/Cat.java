package day01.practice;

public class Cat {
	private int age;
	private String color;
	private String sound;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public static void main(String[] args) {
//		set the values for cat1
		Cat cat1 = new Cat();
		cat1.setAge(4);
		cat1.setColor("White");
		cat1.setSound("Meow!");
		
		// print the cat1 details
		System.out.println("Cat 1:");
		System.out.println("Age: "+ cat1.getAge());
		System.out.println("Color: "+cat1.getColor());
		System.out.println("Speaks: "+ cat1.getSound());
		
		//set the values for cat2
		Cat cat2 = new Cat();
		cat2.setAge(3);
		cat2.setColor("Black");
		cat2.setSound("Meow!");
		
		// print the cat1 details
		System.out.println("Cat 2:");
		System.out.println("Age: "+ cat2.getAge());
		System.out.println("Color: "+cat2.getColor());
		System.out.println("Speaks: "+ cat2.getSound());
		
	

	}

}
