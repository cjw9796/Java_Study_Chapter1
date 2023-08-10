package Map;

import java.util.HashMap;
import java.util.TreeMap;

class User{
	private String id;
	private String pw;
	
	
//생성자
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

//setter,getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	//toString()
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
	
}





public class UserMain {

	public static void main(String[] args) {
		//id pw 3개정도 저장 
		User p = new User("hjgk","1111");
		User p2 = new User("asdf","2222");
		User p3 = new User("zxcv","3333");
		
		HashMap<String, User> list = new HashMap<>();
		
		list.put(p.getId(), p);
		list.put(p2.getId(), p2);
		list.put(p3.getId(), p3);
		
		//1. key가 있는지 확인
		//2. id -> qwer 
		String find = "hjgk";
		
		for(String key : list.keySet()) {
			if(find.equals(key)) {
				//수정하려면? 
				list.get(key).setId("qwer");
				break;
			}
		}

		System.out.println(list);
		
		TreeMap<String, String> list2 = new TreeMap<>();
		
		
	}

}
