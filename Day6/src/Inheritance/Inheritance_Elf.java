package Inheritance;

class Elf {
	String name;
	int hp;
}

class HighElf extends Elf {
	int mp;
}

class ElfLord extends HighElf {
	int shield;
}

public class Inheritance_Elf {

	public static void main(String[] args) {
		Elf e1 = new Elf();
		e1.name = "티란데";
		e1.hp = 100;
		System.out.print("[엘프]");
		System.out.print(e1.name + ",");
		System.out.println(e1.hp);

		HighElf e2 = new HighElf();
		e2.name = "말퓨리온";
		e2.hp = 160;
		e2.mp = 100;

		System.out.print("[하이엘프]");
		System.out.print(e2.name + ",");
		System.out.print(e2.hp + ",");
		System.out.println(e2.mp);

		ElfLord e3 = new ElfLord();
		e3.name = "마이에브";
		e3.hp = 230;
		e3.mp = 140;
		e3.shield = 100;
		System.out.print("[엘프로드]");
		System.out.print(e3.name + ",");
		System.out.print(e3.hp + ",");
		System.out.print(e3.mp + ",");
		System.out.println(e3.shield);

	}

}
