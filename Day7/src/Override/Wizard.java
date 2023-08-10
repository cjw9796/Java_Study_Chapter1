package Override;

public class Wizard {
	
	void fireball() {
		System.out.println("데미지 10씩 준다!");
	}

	class GreatWizad extends Wizard{
		void fireball() {
			System.out.println("데미지 30씩 준다!");
		}
	}
	
	
	public static void main(String[] args) {
		
		//마법사
		Wizard w1 = new Wizard();
		w1.fireball();
		
//		//전직 마법사 
//		GreatWizad g1 = new GreatWizad();
//		g1.fireball();
//		
		//동물
		Animal a1 = new Animal();
		a1.cry();
		
		//고양이 
		Cat c1 = new Cat();
		c1.cry();
		
		//강아지
		Dog d1 = new Dog();
		d1.cry();
	

	}

}
