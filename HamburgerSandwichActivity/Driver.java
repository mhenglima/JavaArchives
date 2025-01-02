
public class Driver {

	public static void main(String[] args) {
		
		Patty angus = new Patty();
		angus.setType("Angus Beef");
		
		Bun plain = new Bun();
		plain.setKind("Plain");
		
		Extras cheese = new Extras();
		cheese.setType("Cheddar Cheese");
		cheese.setAmount(1);
		
		Extras bacon = new Extras();
		bacon.setType("Bacon");
		bacon.setAmount(3);
		
		Extras onion = new Extras();
		onion.setType("Onions");
		onion.setAmount(2);
		
		HamburgerSandwich theBeef = new HamburgerSandwich(plain, angus);
		theBeef.addExtras(cheese);
		theBeef.addExtras(bacon);
		theBeef.addExtras(onion);
		
		theBeef.describeBurger();
	}

}
