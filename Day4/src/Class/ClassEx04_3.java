package Class;

import java.util.ArrayList;
import java.util.Scanner;

//고객의 정보-------------------------------------------------------
class User {
	String id;
	String pw;
	String phone;
	String email;

	// 예매정보를 저장하는 변수
	Reservation res = new Reservation();

	// 기본생성자
	User() {

	}

	// 생성자
	public User(String id, String pw, String phone, String email, Reservation res) {

		this.id = id;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
		this.res = res;
	}
}

//예매정보--------------------------------------------------------
	class Reservation {
		String movie_name; // 영화이름
		String movie_time; // 영화시간
		int number_people; // 인원수
		String movie_room; // 몇 관인지 저장

	



	//기본생성자 
	void Reservation() {
	}
	
	//생성자
	public void Reservation(String movie_name, String movie_time, int number_people, String movie_room) {
		
		this.movie_name = movie_name;
		this.movie_time = movie_time;
		this.number_people = number_people;
		this.movie_room = movie_room;
	}
	
	}

//영화예매---------------------------------------------------------
//고객들의 정보를 저장하는  ArrayList 생성해야됨

class CGV {

	ArrayList<User> Userlist = new ArrayList<>();
	ArrayList<Reservation> Reservationlist = new ArrayList<>();

}




public class ClassEx04_3 {

	public static void main(String[] args) {
		// 영화예매
		// user 정보는 본인걸로!
		// 웅남이 98분 5관 2명 데이터를 저장
		// 각각의 객체들을 만들 때 생성자 이용

		//CGV 생성 
		CGV com = new CGV();
		
		//예매정보 생성 
		Reservation res1 = new Reservation();
		res1.movie_name = "웅남이";  // 영화이름
		res1.movie_time = "98분";  // 영화시간
		res1.number_people = 2;  // 인원수
		res1.movie_room = "5관";  // 몇 관인지 저장
		
		//유저정보 생성 
		User User1 = new User();
		User1.id = "유저1"; 
		User1.pw = "비번1";
		User1.phone ="010-유저1번호";
		User1.email = "유저1@mail"; 
		User1.res = res1;
		
		//CGV고객변수에 저장 
		com.Userlist.add(User1);
		com.Reservationlist.add(res1);
		
		System.out.println(com.Userlist.get(0).pw); //첫번째 유저 유저정보 조회 
		System.out.println(com.Reservationlist.get(0).movie_name); //첫번째 유저 예매정보 조회 
		
//		System.out.println(com.Userlist.get(1).id); //두번째 유저 id 조회 
//		System.out.println(com.Reservationlist.get(1).movie_name); // 
		
		while (true) {
			System.out.println("---CGV---");
			System.out.println("1.영화예매");
			System.out.println("2.영화예매 조회");
			System.out.println("3.영화예매 삭제");
			System.out.println("4.영화예매 종료");

			// 입력받는 Scanner 만들기
			// 입력받는 변수 만들고
			Scanner sc = new Scanner(System.in);
			System.out.println("번호를 입력: ");
			int sel = sc.nextInt();
			//int sel = 0;
			switch (sel) {

			case 1:
				System.out.println("1.영화예매");
				break; // 예매정보, 고객정보 입력을 받아서 객체 생성 후 cgv리스트에 저장
				
			case 2:
				System.out.println("2.영화예매 조회");
				break;
			case 3:
				System.out.println("3.영화예매 삭제");
				break;
			case 4:
				System.out.println("4.영화예매 종료");
				break;

			default:
				System.out.println("다시 입력하세요!");

			}

		}

	}

}
