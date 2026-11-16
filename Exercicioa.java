public class Exercicioa {
	void main() {
		double x, y;
		
		x = Double.parseDouble(IO.readln("Enter first value: "));
		y = Double.parseDouble(IO.readln("Enter second value: "));
		
		if(x>y)
			IO.println("The result is: " + (x - y));
		else
			IO.println("The result is: " + (y - x));
		
	}
}
