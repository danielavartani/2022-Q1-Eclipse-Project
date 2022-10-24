
public class Spider {
//properties / attributes
// make them private
// add 4 attributes
	private String pattern;
	private boolean venomous;
	private String name;
	private boolean canGlide;
	private double length;
	
	
	
// add a default constructor
	public Spider() {
		this.pattern = "solid";
		this.venomous = false;
		this.name = "American House Spider";
		this.canGlide = false;
		tthis.length = 1;
	}
	public void setPattern(String pattern) {
		//calling pattern as it defaults to the nearest available variable 
		pattern = "blah";
		this.pattern = pattern;
	}
	public void setName (String newName) {
		//assign instance variable property to the parameter (input)
		name = newName;
	}
	/* setters allow for change of instance variables */
	public setLength(double newLength) {
		//has a parameter because you're expecting information
		//from the user to see the value
		length = newLength; 
		
	}
	public double getLength() {
		return this.length;
	}
	public boolean getVenomous () {
		return this.venomous;
	}
	/* getter for the name */
	public String getName() {
		return this.name;
	}
	
	//constructor with 1 string argument
	//allows setting of the name during 
	//object construction
	public Spider (String paramName) {
		this (); //calls default constructor
		name = paramName;
	}
	public Spider (String paramName, boolean paramVenom, String paramPattern, int paramLength) {
		name = paramName;
		venomous = paramVenom;
		pattern = paramPattern;
		length = paramLength;
		
	}
//add a toString method to allows printing of Spider objects
	public String toString() {
		String result = name + " \n";
		result += "venomous:" + venomous + "\n";
		result += "glider:" + canGlide + "\n";
		result += "pattern: " + pattern + "\n";
		result += "length: " + length + "\n";
		return result;
	}
	
}
