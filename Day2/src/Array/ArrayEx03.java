package Array;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 1등학생의 학번과 성적 출력
		// 정답: 1004번 98점

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };// 1006
		int[] scores = { 87, 11, 45, 98, 23 };
		
		int index = 1; //각각에 공간에 접근할 때 사용 번호
		int findIdx = -1; // 찾는 값이 없을 때 사용 
		int max = scores[0];
		
		// 이미 max값에 scores 첫번째 값 87을 저장
		// index 굳이 0부터 시작해라~ 쓸 필요가 없다.
		
		while(index < scores.length) {
			if(max < scores[index]) {
				max = scores[index];
				//학번도 같이 출력 findIdx -> 학번의 방번호를 저장 
				findIdx = index +1;
			}
			//다음 공간으로 넘어가기 
			index += 1; // index = index +1
			
		} //while문 끝
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
