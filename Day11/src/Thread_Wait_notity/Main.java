package Thread_Wait_notity;

public class Main {

	public static void main(String[] args) {
		final Dish d = new Dish();
		new Thread(new Customer(d)).start();
		new Thread(new Cook(d)).start();
		
		Customer s = new Customer(d);
		Thread st = new Thread(s);
		st.start();

	}

}
