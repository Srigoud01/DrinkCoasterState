package state;

public class BuyState implements State {
	Coaster coaster;
	public BuyState(Coaster coaster) {
		this.coaster = coaster;
	}

	@Override
	public void buyCoaster() {
		System.out.println("Buying Coaster");
		
	}

	@Override
	public void breakCoaster() {
		System.out.println("Coaster broke");
		coaster.setState(coaster.getBreakState());
		
	}

	@Override
	public void serveCoaster() {
		System.out.println("Serving with coaster");
		coaster.setState(coaster.getServeState());
		
	}

	@Override
	public void washCoaster() {
		System.out.println("Washing Coaster");
		coaster.setState(coaster.getWashState());

	}
	public String toString() {
		return " bought";
	}

}
