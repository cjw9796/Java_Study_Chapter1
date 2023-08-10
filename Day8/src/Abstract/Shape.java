package Abstract;

//도형클래스 
// draw()메서드를 추상화한다. (강제성을 줌)
// 정삼각형을 그린다.
// 정사각형을 그린다.
// 원을 그린다
// 선을 그린다

 
public abstract class Shape {
	void draw() {
		
	};
	정삼각형 a = new 정삼각형();
	정사각형 b = new 정사각형();
	원 c = new 원();
	선 d = new 선();
	
	public void show() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}
}
	
class 정삼각형 extends Shape{

	@Override
	void draw() {
		System.out.println("정삼각형 그리기");// TODO Auto-generated method stub
		
	}

}
class 정사각형 extends Shape{

	@Override
	void draw() {
		System.out.println("정사각형 그리기");
		// TODO Auto-generated method stub
		
	}
	
}
class 원 extends Shape{

	@Override
	void draw() {
		System.out.println("원 그리기");
		// TODO Auto-generated method stub
		
	}
	
}
class 선 extends Shape{

	@Override
	void draw() {
		System.out.println("선 그리기");
		// TODO Auto-generated method stub
		
	}
	
}





