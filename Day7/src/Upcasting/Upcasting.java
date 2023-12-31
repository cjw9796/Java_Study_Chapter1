package Upcasting;
//동물병원 대기 순서표 
//고양이, 강아지,토끼,도마뱀
class Animal_hospital {
	//대기표
	Animal[] 대기표 = new Animal[50]; 
	

}

class Animal{
	String name;
	int age; 
}

class Cat extends Animal {
}

class Dog extends Animal {
}

class Horse extends Animal {
}

class Rabbit extends Animal {
}

public class Upcasting {

	public static void main(String[] args) {
		
		//동물병원 생성
		Animal_hospital ah= new Animal_hospital();
		
		//강아지,고양이,토끼
		// 첫번째
		ah.대기표[0] = new Dog();
		ah.대기표[1] = new Cat();
		ah.대기표[2] = new Rabbit();
		
		// 다양한 객체들을 부모의 타입으로 관리할 수 있다. (업캐스팅)
		

	}

}

/*
 * // 업캐스팅 - 자식 객체를 부모의 타입으로 해석하는 것
 * 
 * // 고양이 객체 생성 Cat c= new Cat(); c.age = 2; c.name = "냥냥이"; c.wei = 1;
 * 
 * //고양이는 동물이다. Animal a = c; //고양이 객체는 동물로 해석
 * 
 * System.out.println(a.name); //System.out.println(a.age); //부모가 자식의 주소값을 저장하고
 * 있으면 //부모가 물려준 변수,메서드에만 접근이 가능하다.
 * 
 * //자식이 부모를 참조 Animal b = new Animal();
 * 
 * //동물은 고양이다? //Cat cc = b; //자식이 부모타입을 참조 불가
 */