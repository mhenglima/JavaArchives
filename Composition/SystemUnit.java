

public class SystemUnit {
	
	private String color, height;
	private CPU cpu; //CPU refers to the class CPU
	
	public SystemUnit (String color, String height, CPU cpu) {
		this.color = color;
		this.height = height;
		this.cpu = cpu;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void getCPU() {
		System.out.println(cpu.getBrand());
		System.out.println(cpu.getCores() + " cores");
		System.out.println(cpu.getSpeed() + " Ghz");
	}
	
}
