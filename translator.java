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
		String inputCopy ="";
		String bork = "Bork Bork Bork!";

		for (int i = 1; i <= 5; i++){
				System.out.println("Enter " + i + " phrase");
				input = kb.nextLine();
				inputCopy = "  " + input.toLowerCase() + "  ";

				for (int i1 = 0; i1 < inputCopy.length(); i1++){
					if (inputCopy.charAt(i1) == '.'){
						inputCopy = inputCopy + bork.toUpperCase();
					}
					else if (inputCopy.indexOf("the") >= 0){
						inputCopy = inputCopy.replace("the", "1");
					}
					else if (inputCopy.indexOf("an") >= 0){
						inputCopy = inputCopy.replace("an", "2");
					}
					else if (inputCopy.indexOf("au") >= 0){
						inputCopy = inputCopy.replace("au", "3");
					}
					else if (inputCopy.charAt(i1) == 'a' && inputCopy.charAt(i1+1) != ' '){
						inputCopy = inputCopy.replace("a", "4");
					}
					else if (inputCopy.indexOf("ow") >= 0){
						inputCopy = inputCopy.replace("ow", "5");
					}
					else if (inputCopy.indexOf("tion") >= 0){
						inputCopy = inputCopy.replace("tion", "6");
					}
					else if (inputCopy.indexOf("ir") >= 0){
						inputCopy =  inputCopy.replace("ir", "7");
					}
					else if (inputCopy.charAt(i1) == 'o'){
						inputCopy= inputCopy.replace("o", "8");
					}
					else if (inputCopy.charAt(i1) == 'i' && inputCopy.charAt(i1-1) != ' '){ //TOOK OUT AND STATEMENT FOR DEBUG
						inputCopy = inputCopy.replace("i", "9");
					}
					else if (inputCopy.charAt(i1) == 'e' && inputCopy.charAt(i1 + 1) == 'n' && inputCopy.charAt(i1 + 2) == ' '){
						inputCopy = inputCopy.replace("en", "10");
					}
					else if (inputCopy.charAt(i1) == 'f'){
						inputCopy = inputCopy.replace("f", "11");
					}
					else if (inputCopy.charAt(i1) == 'e' && inputCopy.substring(0, inputCopy.length() - 2).charAt(i1 + 1) == ' '){ //REMOVED && inputCopy.charAt(i1+1) == ' ' FOR DEBUG
						inputCopy = inputCopy.replace("e", "12");
					}
					else if (inputCopy.charAt(0) != 'u' && inputCopy.charAt(i1) == 'u' && inputCopy.charAt(i1-1) != ' '){
						inputCopy = inputCopy.replace("u", "13");
					}
					else if (inputCopy.charAt(i1) == 'v'){
						inputCopy = inputCopy.replace("v", "14");
					}
					else if (inputCopy.charAt(i1) == 'w'){
						inputCopy = inputCopy.replace("w", "15");
					}
				}
				inputCopy.replaceAll("1", "zee");
				inputCopy.replaceAll("2", "un");
				inputCopy.replaceAll("3", "oo");
				inputCopy.replaceAll("4", "e");
				inputCopy.replaceAll("5", "oo");
				inputCopy.replaceAll("6", "shun");
				inputCopy.replaceAll("7", "ur");
				inputCopy.replaceAll("8", "u");
				inputCopy.replaceAll("9", "ee");
				inputCopy.replaceAll("10", "ee");
				inputCopy.replaceAll("11", "ff");
				inputCopy.replaceAll("12", "e-a");
				inputCopy.replaceAll("13", "oo");
				inputCopy.replaceAll("14", "f");
				inputCopy.replaceAll("15", "v");

				if (i == 1){
					in1 = inputCopy;
				}
				else if (i == 2){
					in2 = inputCopy;
				}
				else if (i == 3){
					in3 = inputCopy;
				}
				else if (i == 4){
					in4 = inputCopy;
				}
				else {
					in5 = inputCopy;
				}
			}

		System.out.println(in1.toUpperCase());
		System.out.println(in2.toUpperCase());
		System.out.println(in3.toUpperCase());
		System.out.println(in4.toUpperCase());
		System.out.println(in5.toUpperCase());








		kb.close();
	}

}
/*	for (int i = 1; i <= 5; i++){											//Seperating input into 5 diff strings
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
	*/
