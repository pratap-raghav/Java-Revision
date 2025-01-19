class circleClass{
	double x, y, r; //(x,y): Coordinates; r: Radius
	
	double circumference(){
		return 44*r/7;
	}
	
	double area(){
		return 22*r*r/7;
	}
}

class circle{
	public static void main(String args[]){
		circleClass c = new circleClass();
		c.x = 0;
		c.y = 0;
		c.r = 7;
		
		System.out.println("Radius: "+c.r);
		System.out.println("x: "+c.x);
		System.out.println("y: "+c.y);
		System.out.println("Circumference: "+c.circumference());
		System.out.println("Area: "+c.area());
	}
}
