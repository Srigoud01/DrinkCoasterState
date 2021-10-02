package state;

public class DrinkCoasterState {

	public static void main(String[] args) {
		Coaster coaster = new Coaster();
		
		System.out.println(coaster);
		
		//bought State
		coaster.buyCoaster();
		coaster.breakCoaster();
		coaster.washCoaster();
		coaster.serveCoaster();
		coaster.buyCoaster();
		System.out.println(coaster);
		//wash state
		coaster.buyCoaster();
		coaster.washCoaster();
		coaster.serveCoaster();
		coaster.breakCoaster();
		System.out.println(coaster);
		//serving state
		coaster.buyCoaster();
		coaster.serveCoaster();
		coaster.washCoaster();
		coaster.breakCoaster();
		

	}

}
