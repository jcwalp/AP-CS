import java.util.Scanner;
public class program12 {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int number = keyBoard.nextInt();
		
		if (number < 0){
			System.out.println("Number is negative");
		}
		
		else if (number > 0){
			System.out.println(number + " is positive");
		}
		
	}

}
