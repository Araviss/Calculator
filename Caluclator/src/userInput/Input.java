package userInput;
import java.util.*;
import userInput.Calculation;


public class Input {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type an operation: ");
		String uInput =  reader.nextLine();
		Calculation.parse(uInput);
		
		
	}
}
