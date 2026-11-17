public class Exerciciol {
	void main() {
		String nome = IO.readln("Enter your name: ");
		int genero = Integer.parseInt(IO.readln("Enter 1 for woman, and 2 for man"));
		
		switch (genero) {
		case 1:
			IO.println("Querida Sra. " + nome);
			break;
		case 2:
			IO.println("Querido Sr. " + nome);
			break;
		default:
			IO.println("Gender invalid");
		}
		
		
	}

}
