package IO_Program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Account implements Serializable{
	
	String id;
	String pw;
	String name;
	
	public Account(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}	
	// 구분자를 이용해서 객체를 생성할 때 
	Account(String[] temp){
		this.id = temp[0];
		this.pw = temp[1];
		this.name = temp[2];
	}	
	
	@Override
	public String toString() {
		
		return id +","+pw+","+name;
	}
}

public class MemberMain {

	public static void main(String[] args) {
		

		// 입력
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("id,pw,name>");
//		String[] temp = sc.nextLine().split(",");
//		
//		Account a1 = new Account("qwer","qwer","하하");
//		Account a2 = new Account("wsxc","wxsc","홍철");
//		Account a3 = new Account("erty","erty","재석");
//		Account a4 = new Account(temp);
//		
//		ArrayList<Account> list = new ArrayList<>();
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
//		list.add(a4);
		
		ArrayList<Account> list = null;
		try {
//		FileOutputStream fos = new FileOutputStream("accountlist.dat");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		oos.writeObject(list);
//		
//		fos.close();
//		oos.close();
		
		
		FileInputStream fis = new FileInputStream("accountlist.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		list = (ArrayList<Account>) ois.readObject();
		
		for(Account a : list) {
			System.out.println(a);
		}
		fis.close();
		ois.close();
		
		}catch(Exception e) {}
		//System.out.println(temp.split(","));
//		for(String s : temp.split(",")) {
//			System.out.println(s);
//			
//		}
		
		
		
	}
}