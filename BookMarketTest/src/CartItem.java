import java.util.ArrayList;


public class CartItem extends Main4{

	
	static ArrayList<String> cartItemList = new ArrayList<>();

	private String itemName;
	private int itemCount;
	private int  totalPrice;
	
	//기본생성자
	public CartItem() {
		// TODO Auto-generated constructor stub
	}

	//생성자 
	public CartItem(String itemName, int itemCount, int totalPrice) {
		super();
		this.itemName = itemName;
		this.itemCount = itemCount;
		this.totalPrice = totalPrice;
	}

	
	
	
	//getter, setter 
	public static ArrayList<String> getCartItemList() {
		return cartItemList;
	}

	public static void setCartItemList(ArrayList<String> cartItemList) {
		CartItem.cartItemList = cartItemList;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	//tostring
	@Override
	public String toString() {
		return "CartItem [itemName=" + itemName + ", itemCount=" + itemCount + ", totalPrice=" + totalPrice + "]";
	}
	
	
	
	
	

	
	


	
	
}