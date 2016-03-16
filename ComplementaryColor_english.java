public class ComplementaryColor {
	
	/* This main method receives two arguments: language and color.
	   Thus, you need to provide them when you're going to execute it.
	   For instance, if you run it on command line, you
	   could simply run: "java ComplementaryColor pt vermelho"
	  
	   If you're running on Eclipse, you need to set the arguments
	   in "Run/Run configurations/Arguments/Program arguments"
	   otherwise you'll just get a runtime exception and nothing will happen
	   Needing help with that don't hesitate on contacting me
	 */	
	/**
	 * 
	 * @param args[0] language (Ex: en)
	 * @param args[1] color (Ex: red)		
	 */
	public static void main(String[] args) {
		if (args[0].equals("en")) {
			String color = args[1];
			System.out.print("Cool, You chosen \"" + color);
			String representation = "";
			String cColor = "";
			if ("red".equals(color)) {
				representation = "tomate";
				cColor = "green";
			}
			else if ("purple".equals(color)) {
				representation = "eggplant";
				cColor = "yellow";
			}
			else if ("blue".equals(color)) {
				representation = "blueberry";
				cColor = "orange";
			}
			else if ("green".equals(color)) {
				representation = "lettuce";
				cColor = "red";
			}
			else if ("yellow".equals(color)) {
				representation = "melon";
				cColor = "purple";
			}
			else if ("orange".equals(color)) {
				representation = "tangerine";
				cColor = "blue";
			};
			System.out.println("\", color of " + representation + ".");

			System.out.println("It's Your complementary color: " + cColor + "!");
		}
	}
}
