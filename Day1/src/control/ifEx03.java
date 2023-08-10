package control;
import java.util.Scanner;

public class ifEx03 {

	public static void main(String[] args) {
		
		/* # 합불판정 
		// 성적 60점 이상 "합격"
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력");
		int score = sc.nextInt();
		
		// 비교를 했을 때 결과 참과 거짓이 나오는 연산자 
		
		if(score >= 60) { // 조건이 참 true
			//만약 조건이 참이라면
		System.out.println("합격!");
		}
		
		if(score < 60) {
			System.out.println("불합격");
		}
		*/
		
		
		/* # 로그인[1단계]
		 * 1. ID와 PW를 입력받는다. (정수4자리)
		 * 2. 입력받은 데이터와 DB데이터를 비교해 로그인 처리를 진행한다.
		 * 예) 로그인 성공 OR 로그인 실패 
		 * 
		 * */
		
		//기존 ID, PW
		int id = 1111;
		int pw = 2222;
		
		//현재 로그인하는 아이디, 비밀번호 저장
		
		int now_id = 1111;
		int now_pw = 2222;
		
		// 1. 먼저 아이디부터 비교, 아이디가 맞으면 "아이디는 맞습니다."
		// 2. 아이디가 다르면 "아이디가 다릅니다."
		
		if(id == now_id) {
			System.out.println("아이디는 맞습니다.");
		}else {
			System.out.println("아이디가 다릅니다.");
		}
		
		// else문 적용 전 코드 
		//if(id != now_id) {
		//	System.out.println("아이디가 다릅니다.");
		//}
		
		// 2. 패스워드를 비교 맞으면 "로그인성공" 틀리면 "아이디 또는 비밀번호를 확인"
		// 논리연산자 그리고 && 
		
		if(id == now_id) {
			//System.out.println("아이디는 맞습니다.");
		 if(pw == now_pw) {
			 System.out.println("로그인 성공");
			 
		 }else {
			 System.out.println("아이디 또는 비밀번호 확인");
		 }
		}else {
			 System.out.println("아이디가 다릅니다.!");
		 }

		
		
		
		
		
		
	}

}

