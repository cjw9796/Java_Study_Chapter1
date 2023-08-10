
class shape{
   shape[] name = new shape[3];
   shape[] area = new shape[3];
}

class Square extends shape{
	
	@Override
	public String toString() {
		return "Square [area = x * y]";
	}

	int x;
	int y;
}
class Triangle extends shape{
	
	
}
class Circle extends shape{
	
}



public class Main {
	
	
  

	@Override
	public String toString() {
		return "area";
	}

	public static void main(String[] args) {
		
		shape shape1 = new shape(); //shape 생성 
		
		shape1.name[0] = new Square();
		shape1.name[1] = new Triangle();
		shape1.name[2] = new Circle();
		System.out.println();
		
		
		        // 클래스 shape
				// 멤버변수 name 
				// 멤버메서드 area 
				//    return double 
				// 클래스로 사용!
				
				// 정사각형은 도형 shape을 상속받음
				// 클래스 이름:square
				//  멤버 변수 :한변의 길이 변수명
				//  area 오버라이딩해서 넓이 구하시오!
				
				// 삼각형 도형 shape을 상속받음
				// triangle
				// 밑변,높이 멤버변수 
				//  area 오버라이딩해서 넓이 구하시오!
				
				// 원 도형 shape을 상속받음
				// Circle 
				// 반지름 멤버변수 
				// area 오버라이딩해서 넓이 구하시오!
				
				// 위에있는 아이들의 그룹(업캐스팅)
				// 반복문과 배열을 이용해서 
				// 코드의줄을 4줄 안쪽으로 작성해보세요! 
	

		
		
		
		
	}

}
