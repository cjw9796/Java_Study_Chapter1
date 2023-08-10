package Polymorphism;

public class Avg {
	
	int kor = 90;
	int eng = 90;
	int mat = 90;
	double avg;
	
	void avg() {
		int avg2 = (kor + eng / 2);
	    int avg3  = (kor+eng+mat / 3);
		System.out.println("평균계산");
	}

}


class two_avg extends Avg{
	
	void two_avg(int kor, int eng) {
		this.avg = (this.kor + this.eng) /2;
		System.out.println("avg_kor,eng");
	}
}

class three_avg extends Avg{
	
	void three_avg(int kor, int eng, int mat) {
		this.avg = (this.kor + this.eng + this.mat) /3;
		System.out.println("avg_kor,eng,mat");
	}
}