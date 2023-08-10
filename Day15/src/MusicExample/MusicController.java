package MusicExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicController {
	
	//전역변수
	Scanner sc;
	//컨트롤러 안에 list 생성 했다. 
	private ArrayList<Music> list = new ArrayList<>();
	
	//생성자
	public MusicController(){};
	public MusicController(Scanner sc) {
		this.sc = sc;
	}
	
	//스캐너 안만들고 뷰가 가지고 있는 스캐너를 사용할것
	void input(Scanner con) {
		
	}

	
	public int addList(Music temp) {
		//마지막 리스트에 객체 저장 1리턴
		// 뷰 addList()에서 입력받아서 만든 뮤직클래스의 객체 
		// 실제 컨트롤러에 있는 Arraylist에 추가한다. add(뮤직클래스의 객체)
		boolean res = list.add(temp);
		if (res) {
			return 1;  //정상적으로 저장됬다. 이 값은 뷰-> addList
		}else {
			return 0;  // 비정상 (저장 X)
		}		
	}
	
	public int addAtZero(Music music) {
		//첫번째 리스트에 객체 저장 1리턴
	}
	
	public List printAll() {
		
	}
	
	public Music searchMusic(String title) {
		
	}
	public Music removeMusic(String title) {
		
	}
	public Music setMusic(String title,Music music) {
		
	}
	
	public int ascTitle() {
		
	}
	
	public int descSinger() {
		
	}
	

	
}
