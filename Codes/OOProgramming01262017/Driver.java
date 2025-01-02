package OOProgramming01262017;


public class Driver {

	public static void main(String[] args) {
				
		Student john = new Student();
		john.setName("John");
		john.setAge(38);
		john.setIdNum("9656006");
		
		Calculator casio = new Calculator();
		casio.setBrand("Casio");
		casio.setColor("Grey");
		casio.setType("Regular");
				
		john.useCalculator(casio);
		
	}

}
