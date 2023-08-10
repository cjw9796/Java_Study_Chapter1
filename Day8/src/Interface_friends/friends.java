package Interface_friends;

public class friends {

	
}

interface friends_aiga{
	void aiga();

}

class 뮤지션 extends friends implements friends_aiga{

	@Override
	public void aiga() {
		System.out.println("뮤지션 김씨 -> 칭구 아이가!");
		
	}
}

class 건축가 extends friends implements friends_aiga{

	@Override
	public void aiga() {
		System.out.println("건축가 이씨 -> 칭구 아이가!");
		
	}
}

class 개발자 extends friends implements friends_aiga{

	@Override
	public void aiga() {
		
		System.out.println("개발자 박씨 -> 칭구 아이가!");
	}	
}

class 변호사 extends friends implements friends_aiga{

	@Override
	public void aiga() {
		System.out.println("변호사 최씨 -> 칭구 아이가!");
		
	}
	
}