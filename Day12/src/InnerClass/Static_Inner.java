package InnerClass;
//클래스 안에 클래스를 작성하는 공간 
//멤버변수 

import javax.swing.JOptionPane;

class out{
	static int a = 1;  //컴파일 하는 동안 static 영역에 메모리를 할당 
	
	static class In{
		String Infun() {
			return a + "번째 static 내부 클래스!";
		}
	}
}

public class Static_Inner {

	public static void main(String[] args) {
		
		String str = "";
		//외부클래스의 이름은 주고 그리고 나서 내부클래스의 명 주면된다.
		
		out.In obj = new out.In();
		
		str = obj.Infun();
		
		JOptionPane.showMessageDialog(null, str);
		
		

	}

}
