import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  
		/*Scanner is the Class, Input is the name of the variable; 
		new Scanner creates a Scanner object or instance, standard predefined input stream object*/
		
		
		System.out.println("Enter a line of text: "); 	//This is a prompt
		String line = input.nextLine();					//Wait for user to enter line of text	
		System.out.println("You entered: "+ line);
				
		System.out.println("Enter an integer number: "); 	
		int value = input.nextInt();					
		System.out.println("You entered: "+ value);
		
		System.out.println("Enter a floating point value: "); 	
		double value2 = input.nextDouble();
		System.out.println("You entered: "+ value2);
		
		
	}

}
