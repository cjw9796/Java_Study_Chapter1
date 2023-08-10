package Interface;

interface Fly{
	void fly();
}
interface Walk{
	void walk();
}
interface Cry{
	void cry();
}


class Dog implements Walk,Cry{

	@Override
	public void cry() {
		System.out.println("멍멍");
		
	}

	@Override
	public void walk() {
		System.out.println("개걸음");
		
	}
	
}

class Chicken implements Walk,Fly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Bird implements Walk,Fly,Cry{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}
