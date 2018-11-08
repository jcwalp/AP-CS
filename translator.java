package swedishChef;
import java.util.Scanner;

public class Translator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 1st phrase: ");
		String in1 = kb.next();
		System.out.println("Enter 2nd phrase: ");
		String in2 = kb.next();
		System.out.println("Enter 3rd phrase: ");
		String in3 = kb.next();
		System.out.println("Enter 4th phrase: ");
		String in4 = kb.next();
		System.out.println("Enter 5th phrase: ");
		String in5 = kb.next();



		if(in1.endsWith(".")){
			in1 = in1 + " Bork Bork Bork!";
		}
		else if (in2.endsWith(".")){
			in2 = in2 + " Bork Bork Bork!";
		}
		else if (in3.endsWith(".")){
			in3 = in3 + " Bork Bork Bork!";
		}
		else if (in4.endsWith(".")){
			in4 = in4 + " Bork Bork Bork!";
		}
		else if (in5.endsWith(".")){
			in5 = in5 + " Bork Bork Bork!";
		}
		else if (in1.indexOf("the") >= 0){
			in1 = in1.replace("the", "zee");
		}
		else if (in2.indexOf("the") >= 0){
			in2 = in2.replace("the", "zee");
		}
		else if (in3.indexOf("the") >= 0){
			in3 = in3.replace("the", "zee");
		}
		else if (in4.indexOf("the") >= 0){
			in4 = in4.replace("the", "zee");
		}
    else if (in5.indexOf("the") >= 0){
      in5 = in5.replace("the", "zee");
    }
    else if (in1.indexOf("an") >= 0){
      in1 = in1.replace("an", "un");
    }
    else if (in2.indexOf("an") >= 0){
      in2 = in2.replace("an", "un");
    }
    else if (in3.indexOf("an") >= 0){
      in3 = in3.replace("an", "un");
    }
    else if (in4.indexOf("an") >= 0){
      in4 = in4.replace("an", "un");
    }






		kb.close();
	}

}
