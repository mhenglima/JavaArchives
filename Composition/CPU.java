

public class CPU {

	private int cores;
	private double speed;
	private String brand;
	
	public CPU (int cores, double speed, String brand) {
		this.cores = cores;
		this.speed = speed;
		this.brand = brand;
	}

	public int getCores() {
		return cores;
	}

	public double getSpeed() {
		return speed;
	}

	public String getBrand() {
		return brand;
	}
	
	
	
}
