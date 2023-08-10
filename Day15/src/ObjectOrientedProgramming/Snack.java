package ObjectOrientedProgramming;

public class Snack {
	
	private String kind; //종류
	private String name; //이름 
	private String flavor; //맛 
	private int numOf ; //개수 
	private int price; //가격 

	
	
	
	///////////////////////////// get,set 
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	public Snack(){}; //기본 생성자 

	public Snack(String kind, String name, String flavor, int numOf, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}	
	
	public  void information() { 
		Snack();
		
		System.out.println(getKind()+"종류");
		System.out.println(getName()+"이름");
		System.out.println(getFlavor()+"맛");
		System.out.println(getNumOf()+"개수");
		System.out.println(getPrice()+"가격");
	}



	private void Snack() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		

	}

}
