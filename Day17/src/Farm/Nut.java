package Farm;

import java.util.Objects;

public class Nut {
	
	String name;
	
	//기본 생성자 
	public Nut() {}
	
	
	//생성자
	public Nut(String name) {
		super();
		this.name = name;
	}
//매개변수 받는 생성자 
	public Nut(String addname, int howmany) {
		// TODO Auto-generated constructor stub
	}


	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//tostring
	@Override
	public String toString() {
		return "Nut [name=" + name + "]";
	}

	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nut other = (Nut) obj;
		return Objects.equals(name, other.name);
	}
	
	

}
