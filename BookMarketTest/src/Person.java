
public class Person extends Main4 {
	private String name;
	private int phone;
	private String address;

	public Person(String name, int phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// tostring
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

}

class Admin extends Person{
	
	void AdminLogin() {
		System.out.println("관리자 정보를 입력하세요");
		System.out.println("아이디: ");
		
		System.out.println("비밀번호: ");
	};

	public Admin(String name, int phone, String address) {
		super(name, phone, address);
		// TODO Auto-generated constructor stub
	}
	
}