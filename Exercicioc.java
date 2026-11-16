public class Exercicioc {
	void main () {
		double x, y, z, w, media;
		
		x = Double.parseDouble(IO.readln("Enter first grade: "));
		y = Double.parseDouble(IO.readln("Enter second grade: "));
		z = Double.parseDouble(IO.readln("Enter third grade: "));
		w = Double.parseDouble(IO.readln("Enter fourth grade: "));
		
		media = (x+y+z+w)/4;
		
		if(media >= 7) {
			IO.println("Student passed!");
			}
		else {
			IO.println("Student failed.");
			}
		IO.println("Final grade: " + media);	
	
	}
}
