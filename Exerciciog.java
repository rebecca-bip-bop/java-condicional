public class Exerciciog {
	void main () {
		double a, b, c, d;
		
		a = Double.parseDouble(IO.readln("Enter first value: "));
		b = Double.parseDouble(IO.readln("Enter second value: "));
		c = Double.parseDouble(IO.readln("Enter third value: "));
		d = Double.parseDouble(IO.readln("Enter fourth value: "));
		
		IO.println("Numbers divisible by both 2 and 3 are: ");
		
		if(a % 6 == 0) {
			IO.println(a);
		} if(b % 6 == 0) {
			IO.println(b);
		} if(c % 6 == 0) {
			IO.println(c);
		} if(d % 6 == 0) {
			IO.println(d);
		} 
	}

}
