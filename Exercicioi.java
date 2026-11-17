public class Exercicioi {
	void main() {
		double a = Double.parseDouble(IO.readln("Enter value:"));
		
		if (a % 2 == 0) {
			IO.println(a + " is even");
		} else {
			IO.println(a + " is not even");
		}
	}

}

