import java.util.Scanner; //imports scanner package

public class program12 {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in); //assigns scanner to keyBoard
		
		System.out.println("Please enter a number: "); //Asks user for input
		
		int number = keyBoard.nextInt(); //assigns user input to integer 
		
		if (number < 0){ //if user input is less than 0
			
			if (number % 2 == 0){  
				System.out.println("Number is negative and even"); //prints that the number is negative
			}
			
			else{
				System.out.println("Number is negative and odd"); //prints that the number is negative
			}
	
		}
		
		else if (number == 0){
			System.out.println(number + " is neither negative nor positive");
		}
		
		else if (number > 0){ //if user input is greater than 0
			
			if (number % 2 == 0){  
				System.out.println("Number is positive and even"); //prints that the number is positive and even
			}
			
			else{
				System.out.println("Number is positive and odd"); //prints that the number is positive and even
			}
		}
		keyBoard.close(); //closes the keyboard
	}

}
