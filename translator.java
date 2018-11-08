package swedishChef;
import java.util.Scanner;

public class Translator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String in1 = "";
		String in2 = "";
		String in3 = "";
		String in4 = "";
		String in5 = "";
		String input = "";
		for (int i = 1; i <= 5; i++){											//Seperating input into 5 diff strings
			System.out.println("Enter " + i + " phrase");
			input = kb.next();
			if (i == 1){
				in1 = input.toLowerCase();
				if (in1.indexOf(".") >= 0){
					in1 = in1 + " Bork Bork Bork!";
				}
				else if (in1.indexOf("the") >= 0) {
					in1 = in1.replace("the", "ZEE");
				}
				else if (in1.indexOf("an") >= 0){
					in1 = in1.replace("an", "UN");
				}
				else if (in1.indexOf("au") >= 0){
					in1 = in1.replace("au", "OO");
				}
				else {
					in1 = in1;
				}
				for (int i = 0; i <= in1.length(); i++){
					String next = in1.substring(i, )
					if (in1.substring(i, i+1).equals("a") && in1.substring(i+1, i+2).)
				}
			}





			else if (i == 2){
				in2 = input.toLowerCase();
			}
			else if (i == 3){
				in3 = input.toLowerCase();
			}
			else if (i == 4){
				in4 = input.toLowerCase();
			}
			else if (i == 5){
				in5 = input.toLowerCase();
			}
			else {
				input = input.toLowerCase();
			}

		}																								//End of seperating


		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		System.out.println(in4);
		System.out.println(in5);








		kb.close();
	}

}
