public class Exerciciof {
	void main() {
	    int a = Integer.parseInt(IO.readln("Enter the first value: "));
	    int b = Integer.parseInt(IO.readln("Enter the second value: "));
	    int c = Integer.parseInt(IO.readln("Enter the third value: "));

	    int temp;

	    if (a > b) {
	        temp = a;
	        a = b;
	        b = temp;
	    }

	    if (a > c) {
	        temp = a;
	        a = c;
	        c = temp;
	    }

	    if (b > c) {
	        temp = b;
	        b = c;
	        c = temp;
	    }

	    IO.println("Values in ascending order: " + a + " " + b + " " + c);
	}

}

// REFAZER
