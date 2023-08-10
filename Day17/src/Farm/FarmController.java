package Farm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 

public class FarmController {
	
	Scanner sc; //전역변수
	
	
	
	
	public HashMap<String, Integer> adminlist = new HashMap<String, Integer>(10); //마트에서 농산물 저장용 HashMap 객체 생성
	public ArrayList<Farm> customerlist = new ArrayList<>(); //고객이 구매한 농산물 저장용 ArrayList 객체 생성

	
	
	
	//생성자 
	public FarmController() {}
	public FarmController(Scanner sc) {
		this.sc = sc; 
	}
	
void input(Scanner con) {
		
	}

	
	

	public int addList(String temp) {
		// TODO Auto-generated method stub
		//adminlist.put("사과",3);
		//adminlist.put(addname, howmany);
		adminlist.put(temp,1);
		
		System.out.println(adminlist);
		
		return 0; 
	
		
		//boolean res = adminlist.containsValue(temp);
		if (res) {
			return 1;  //정상적으로 저장됬다. 이 값은 뷰-> addList
		}else {
			return 0;  // 비정상 (저장 X)
		}		
	
	}
	public int addList(Vegetable temp2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int addList(Nut temp3) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int addList(Fruit temp) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


}
