public class Exercicioh {
	void main() {
	    int a = Integer.parseInt(IO.readln("Enter number 1: "));
	    int b = Integer.parseInt(IO.readln("Enter number 2: "));
	    int c = Integer.parseInt(IO.readln("Enter number 3: "));
	    int d = Integer.parseInt(IO.readln("Enter number 4: "));
	    int e = Integer.parseInt(IO.readln("Enter number 5: "));

	    int max = a;
	    int min = a;

	    if (b > max) max = b;
	    if (b < min) min = b;

	    if (c > max) max = c;
	    if (c < min) min = c;

	    if (d > max) max = d;
	    if (d < min) min = d;

	    if (e > max) max = e;
	    if (e < min) min = e;

	    IO.println("Highest: " + max);
	    IO.println("Lowest:  " + min);
	}
}

//REFAZER
