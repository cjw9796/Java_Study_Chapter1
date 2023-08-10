package Variable;

class Employee{
	
	String name; //이름 
	int[] hours; //요일별 일한 시간 저장 
	
	//생성자 생성 
	public Employee(String name, int[] hours) {
		this.name = name;
		this.hours = hours;
	}
	
	//시간 출력
	void printTotalHours() {
		System.out.println(name + "->"+ totalHours());
		
	}
	//시간계산
	int totalHours() {
		
		int sum = 0; //일한 시간을 누적하는 변수 
		for(int i =0; i<hours.length; i++) {
			sum += hours[i];
		}

		/*for each문
		 * 배열안에 데이터 만큼만 반복
		 * for(배열타입 변수명 : 배열명){
		 * }
		 * 
		 */
//		for(int num:hours) {
//			sum = sum+num;
//			//hours배열에서 0번째 방부터 하나씩 꺼내서 num변수에 저장한다.
//			//꺼내다가 마지막 데이터가 나오고 더 이상 꺼낼게 없으면
//			//반복을 자동으로 종료한다. 
//		}
		return sum; //일한시간을 모두 더해서 결과를 돌려준다;
	}
	
	
}

public class ReferenceVar {

	public static void main(String[] args) {
		/*
		 * 레퍼런스 변수
		 * -레퍼런스 변수란, 객체를 가리키는 변수다.
		 */
		
		//배열생성
		//직원0번
		
		int[] hours0 = {2,4,3,4,5,8,8};
		int[] hours1 = {7,3,4,3,3,4,4};
		int[] hours2 = {3,3,4,3,3,2,2};
		int[] hours3 = {9,3,4,7,3,4,1};
		int[] hours4 = {3,5,4,3,6,3,8};
		int[] hours5 = {3,4,4,6,3,4,4};
		int[] hours6 = {3,7,4,8,3,8,4};
		int[] hours7 = {6,3,5,9,2,7,9};
		
		
		//객체 생성 //여기서 e0은 레퍼런스 변수가 된다.
		Employee e0 = new Employee("직원 0", hours0);
		e0.printTotalHours();
		Employee e1 = new Employee("직원 1", hours1);
		e1.printTotalHours();
		Employee e2 = new Employee("직원 2", hours2);
		e2.printTotalHours();
		Employee e3 = new Employee("직원 3", hours3);
		e3.printTotalHours();
		Employee e4 = new Employee("직원 4", hours4);
		e4.printTotalHours();
		Employee e5 = new Employee("직원 5", hours5);
		e5.printTotalHours();
		Employee e6 = new Employee("직원 6", hours6);
		e6.printTotalHours();
		Employee e7 = new Employee("직원 7", hours7);
		e7.printTotalHours();
		
		//----------------------------------------------------------
		// 객체들의 주소값을 여러개 저장, 레퍼런스 배열을 이용해 출력  
		//직원(객체들을 저장하는 관리하는 배열)
		Employee[] list = new Employee[8];
		list[0] = e0;
		list[1] = e1;
		list[2] = e2;
		list[3] = e3;
		list[4] = e4;
		list[5] = e5;
		list[6] = e6;
		list[7] = e7;

		
		//for each문을 이용해서 각각의 printTotalHours?
		//0번부터 순서대로 t변수에 담기고
		//7번까지 반복 후 더 이상 꺼내 올 데이터가 없으면 반복이 자동으로 종료된다.
		for(Employee t : list) {
			t.printTotalHours();
		}

		
		
	}

}
