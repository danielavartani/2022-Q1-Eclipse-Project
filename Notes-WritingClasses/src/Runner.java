
public class Runner {

	public static void main(String[] args) {
		//by-default: a default constructor
		//is provided if non are in the class
		
		Ghost casper = new Ghost();
		//dot operator allows access to all PUBLIC methods and properties
		//casper.name = "test";
		System.out.println(casper); //does not know how to print objects
		
		Spider s = new Spider();
		System.out.println(s);
		/*
		 * 
		 * Spider s = new Spider("Tarantula");
		 * What constructor do you need so the code
		 * above is valid?
		 */
		
		Spider s2 = new Spider ("Tarantula", true, "solid brown", 5);
		//System.out.println(s2);
		//System.out.println(s2.getName());
		//System.out.println(s2.getLength());
	//	System.out.println(s2.getVenomous());
		
		//set a new length outside of the class 
		System.out.println(s2.getLength());
		s2.setLength(10);
		System.out.println(s2.getLength());
		/*
		 * add another constructor so I can
		 * set the pattern; venomous
		 * name and length of a Spider object
		 * during construction
		 * 
		 */
		// TODO Auto-generated method stub
//only 1 public class can exist in a java file
// and it should match the file name!
		//Holloween = Fall = thanksgiving
		//Unit 2: class template for creating objects
	}
	}
	class Ghost{
	//Properties - Attributes
	//private - always try to hide properties from outsiders
	public String name;
	private double opacity;
	private double height;
	private boolean isScary;
	
	//add constructor that will set the attributes
	//to some default state
	public Ghost () {//zero-argument constructor (default constructor)
		
		name = "Boo";
		opacity = 0.0;
		height = 5.0;
		isScary = false;
	}
	//the toString method allows printing of this objects
	//its called everything this objects is passed to print or println
	public String toString () {
		return name + ":" + isScary; 
	}
	
}
