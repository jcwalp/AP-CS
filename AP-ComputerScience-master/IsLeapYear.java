package isLeapYear;
import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);
		
		int year;
	
		System.out.println("Enter Year: ");
		year = keyBoard.nextInt();
		
		if ((year % 400 == 0 || year % 100 != 0) && year % 4 == 0){
			System.out.println(year + " is a leap year");
		}

		else {
			System.out.println(year + " is not a leap year");
		}
		
		
		keyBoard.close();
	}

}
