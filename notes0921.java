
public class ints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answerA;
		double answerB;

		int a, b, c;
		double d, e, f;

		//integers
		a = 2;
		b = 7;
		c = 8;
		//doubles
		d = 3.0;
		e = 5;
		f = .001;


		answerA = (int)(6. * Math.random()) + 1; 							//answerA = (int)(a * d); called casting, changing it to an integer
		answerB = b / 2.;

		System.out.println(answerA);
		System.out.println(answerB);
													//Math.pow = great way to do powers in java, doesnt work with ints
													//dividing two integers does it as an int then converts
													//when you want a decimal answer cast as a double in the statement
													//avoid mixed math where possible
													//math.random is going to give a num between 0 and 1
	}

}
