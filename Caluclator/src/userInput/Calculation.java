package userInput;

public class Calculation {
	
	
	public  Calculation() {
		
	}
	//Splitting string for 
	public static String parse(String input) {
		String[] operator = new String[20];
		String[] delimiter = input.split("-|\\*|\\+|/");
		int counter = 0; //placeholder for the operators
		
		//this searches to see if there is an operator
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c == '+'||c == '-'||c == '+'||c == '*'){
				operator[counter] = Character.toString(c);
				counter++;
			}
		}
		//Alternates between delimiter and operator to make equation
		String[] equation = new String[(counter*2)+1];//Create array based on number of elements in operator & delimiter
		int x = 0;
		int y = 0;
		for(int i = 0; i < equation.length; i ++) {
			if( i % 2 == 0) {
				equation[i]= delimiter[x];
				x++;
			}
			else if(i % 2 !=0) {
				equation[i] = operator[y];
				y++;
				}
		}
		
		for(String m:equation) {
			System.out.println(m);
		}
		return null;
	}
	
	
	//Adds the parsed numbers
	public static double add (ArrayList equation) {
		
		return 0.000;
	}

}
