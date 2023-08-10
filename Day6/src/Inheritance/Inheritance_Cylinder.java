package Inheritance;


class Cylinder{
	double radius; //반지름
	double height; //높이 
	double bottomArea;
	
	
	
	void Cylinder(double radius, double height, double bottomArea) {
		
		this.radius = radius;
		this.height = height;
		this.bottomArea = (3.14* radius * radius);
	}

	
}


public class Inheritance_Cylinder {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		
		c1.radius = 3;
		c1.height = 5;
		
	
		
		
		
		
		
		
		
	}


}
