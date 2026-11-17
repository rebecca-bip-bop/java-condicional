public class Exercicioe { 
	void main() {
		double a, b, c, delta, x1, x2;
		a = Double.parseDouble(IO.readln("enter a value: "));
		b = Double.parseDouble(IO.readln("enter b value: "));
		c = Double.parseDouble(IO.readln("enter b value: "));
		
		if (a != 0) {
			delta = (Math.pow(b, 2))-4*a*c;
			x1 = (-b + delta)/2*a;
			x2 = (-b - delta)/2*a;
			
			IO.println("The two roots are: " + x2 + " and " + x1 + ".");
			
		} else {
			IO.println("'a' value is zero, operation invalid");
		}
				
	}

}
