package Interface;

//static 인터페이스명.상수에 접근 가능하다.
public interface Hero {
	
	int MAX_HP = 100; //체력 public static final 생략되어있음
	
	
	void attack(); //공격력
	void heal(int portion); //치료 
	

}
