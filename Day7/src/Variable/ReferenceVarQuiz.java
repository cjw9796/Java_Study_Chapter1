package Variable;

class player{
	
	String name; //이름 
	int[] points; //득점 저장 
	
	//생성자 생성 
	public player(String name, int[] points) {
		super();
		this.name = name;
		this.points = points;
	}
	
	//획득 점수 출력 
	void printTotalPoints() {
		System.out.println(name + "->" + totalPoints()+"점");
	}
	
	//점수 계산 
	int totalPoints() {
		
		int sum = 0; //점수를 누적하는 변수
		for(int i=0; i<points.length; i++) {
			sum += points[i];
		}
		return sum;
	}
	
}




public class ReferenceVarQuiz {

	public static void main(String[] args) {
		//배열 생성 
		
		int[] points0 = {10,9,9,8};
		int[] points1 = {9,10,9,9};
		int[] points2 = {10,9,10,10};
		
		player p0 = new player("kim", points0);
		p0.printTotalPoints();
		player p1 = new player("lee", points1);
		p1.printTotalPoints();
		player p2 = new player("park", points2);
		p2.printTotalPoints();
		
////		player[] list = new player[3];
////		list[0] = p0;
////		list[1] = p1;
////		list[2] = p2;
////		
//		for(player p : list) {
//			p.printTotalPoints();
//		}

	}

}
