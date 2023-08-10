package Farm;

import java.util.Objects;

public class Farm {
	String kind;
	
	//기본 생성자 
	public Farm() {}

	//생성자
	public Farm(String kind) {
		super();
		this.kind = kind;
	}

	//getter setter 
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	//tostring
	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
	}

	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(kind);
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
		Farm other = (Farm) obj;
		return Objects.equals(kind, other.kind);
	}
	
	

}
