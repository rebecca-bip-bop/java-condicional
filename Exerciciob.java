public class Exerciciob {
	void main() {
		double x;
		x = Double.parseDouble(IO.readln("Enter x value: "));
		if(x<0)
			IO.println("The module of said number is: " + (x*-1));
		else
			IO.println("The module of said number is: " + x);
	}
	

}
