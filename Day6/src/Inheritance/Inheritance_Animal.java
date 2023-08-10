package Inheritance;

class Animal{
	String name;
	
	void cry() {}
}


class pet extends Animal{
	String age;
	int price;

	void play() {}
	
}


public class Inheritance_Animal {

	public static void main(String[] args) {
		
		pet p1= new pet();
		p1.name = "차우차우";
		p1.age = "3세";
		p1.price = 2200000;
		
		System.out.print(p1.name + ",");
		System.out.print(p1.age + ",");
		System.out.print(p1.price);

	}

}
