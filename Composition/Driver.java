

public class Driver {

	public static void main(String[] args) {

		CPU intel = new CPU(8, 3.4, "Intel");
		SystemUnit MyPC = new SystemUnit("Black", "Medium", intel);
		
		System.out.println("Your PC Specs: ");
		System.out.println(MyPC.getColor() + " color");
		System.out.println(MyPC.getHeight() + " size casing");
		MyPC.getCPU();
		
		
		

	}

}
