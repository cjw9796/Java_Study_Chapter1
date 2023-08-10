package Linkedlist;

class Node{
	
	int data; //데이터
	Node next; //다음 주소

}

public class LinkedlistEx {

	public static void main(String[] args) {
		
		/*
		 *리스트 
		 * - 배열 기반이 아니라 리스트 기반
		 * - 열차 칸처럼 변수를 만들어서 주소값을 이용해서 찾아간다. 
		 * - 시작점에는 데이터를 저장하지 않는다.
		 * 
		 * Arraylist와 linkedlist 
		 * 검색 편하다     검색 불편하다
		 * 인덱스번호 있음  인덱스번호 없음
		 * 추가,삭제 불편   추가,삭제 용이 
		 * 
		 * 링크리스트의 시작점 
		 * 머리(head) -- 데이터 저장x
		 * 
		 * 
		 */
	
		int count=0;
		Node head = new Node();
		
		//실제 첫번째 노드를 생성 
		Node node1 = new Node(); 
		node1.data = 10;
		head.next = node1;
		count++;
		//두번째 노드를 생성
		
		Node node2 = new Node();
		node2.data = 20;
		node1.next = node2;
		count++;
		//두번째 노드를 생성
		
		Node node3 = new Node();
		node3.data = 30;
		node2.next = node3;
		count++;
		//nodenext를 이용해서 데이터 결과를 출력 
		
		//기본출력
		System.out.println(head.next.data);  // node1 출력
		System.out.println(head.next.next.data); // node2 출력
		System.out.println(head.next.next.next.data); // node3 출력 
		
		//반복문 이용 출력
		//head를 넣게 되면 head객체의 data를 출력 = 0부터 출력
		// head.next 다음 주소값을 가져온다. 첫번째 node1
		Node temp = head.next;
		
		for(int i=0; i<count;i++) {
			System.out.println(temp.data);
			temp = temp.next; //head.next.next 
		}
		
		//node1 삭제
		//1. node1 먼저 찾는다.
		//2. node1.next -> head.next 연결 

		Node del = node1;
		// node1이 가지고 있는 next 즉, node2의 주소값을 저장해라 
		head.next = del.next;
		
		
		
	}

}
