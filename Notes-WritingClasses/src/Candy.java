
public class Candy {

		private String color;
		private boolean sweet;
		private String name;
		private boolean sour;
		private double size;
	 
		//add a default constructor
		public Candy() {
			color = "red";
			sweet = true;
			name = "Sour Patch";
			sour = true;
			size = 1;
		}
	 
		public Candy (String paramName) {
			this();
			name = paramName;
		}
	 
		public Candy (String paramName, boolean paramSweet, String paramColor
				, int paramSize, boolean paramSour) {
			name = paramName;
			sweet = paramSweet;
			color = paramColor;
			size = paramSize;
			sour = paramSour;
	 
		}
	 
		public String toString() {
			String result = name + "\n";
			result 		+= "sweet: " + sweet + "\n";
			result 		+= "color: " + color + "\n";
			result 		+= "size: " + size + "\n";
			result 		+= "sour: " + sour + "\n";
			
			return result;
		}
	 

	}


