import java.util.ArrayList;
public class HamburgerSandwich {
	
	private Bun bun;
	private Patty patty;
	private ArrayList<Extras> extras = new ArrayList<Extras>();
	
	public HamburgerSandwich(Bun bun, Patty patty) {
		this.bun = bun;
		this.patty = patty;
	}
	
	public void setBun(Bun bun) {
		this.bun = bun;
	}
	
	public String getBun() {
		return bun.getKind();
	}
	
	public void setPatty(Patty patty) {
		this.patty = patty;
	}
	
	public String getPatty() {
		return patty.getType();
	}
	
	public void addExtras(Extras extra){
		extras.add(extra);
	}
	
	public void checkExtras() {
		if(extras.size() != 0) {
			System.out.println("With Extras:");
			for(int i = 0; i < extras.size(); i++)
				System.out.println("\t" + extras.get(i).getAmount() + " piece/s " + extras.get(i).getType());
		}
		else
			System.out.println("No extras added!");
	}
	
	public void describeBurger() {
		System.out.println("You ordered a burger with: ");
		System.out.println("\t" + bun.getKind() + " buns");
		System.out.println("\t" + patty.getType() + " patty");
		System.out.println();
		checkExtras();

			
	}
}
