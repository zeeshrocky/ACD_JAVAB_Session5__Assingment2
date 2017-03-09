package s5_Assignment2;

class Building {
	public Building(){
		System.out.println("A Building is created");
	}
	public void tall(){
		System.out.println("This is a Tall Buliding");
	}
	public void small(){
		System.out.println("This is a Short Building");
	}
	public void round(){
		System.out.println("This is a Round Shaped Building");
	}
	
	public void square(){
		System.out.println("This is a Square Shaped Building ");
	}
}

class LenghtOfBuildings extends Buildings{
	public LenghtOfBuildings() {
		super();
		System.out.println("This Shows the Lenght of the Building");
	}
	public void tall(){
		System.out.println("This is a Tall Buliding");
	}
	public void small(){
		System.out.println("This is a Short Building");
	}
}

class ShapeOfBuildings extends Buildings{
	public ShapeOfBuildings(){
		super();
		System.out.println("This Shows the Shape of the Building");
	}
	public void round(){
		System.out.println("This is a Round Shaped Building");
	}
	
	public void square(){
		System.out.println("This is a Square Shaped Building ");
	}
}

public class Buildings{
	public static void main(String args[]){
		Building b1=new Building();
		LenghtOfBuildings l1=new LenghtOfBuildings();
		ShapeOfBuildings s1=new ShapeOfBuildings();
		System.out.println();
		b1.small();
		b1.round();
		l1.tall();
		s1.square();
	}
}