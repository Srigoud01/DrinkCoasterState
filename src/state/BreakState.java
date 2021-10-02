package state;

public class BreakState implements State {
	Coaster coaster;
	public BreakState(Coaster coaster) {
		this.coaster = coaster;
	}

	@Override
	public void buyCoaster() {
		System.out.println("Buying Coasters ");
		coaster.setState(coaster.getBuyState());
	}

	@Override
	public void breakCoaster() {
		System.out.println("Coaster broke");

	}

	@Override
	public void serveCoaster() {
		System.out.println("Coaster broken cannot serve");

	}

	@Override
	public void washCoaster() {
		System.out.println("Coaster broken cannot be washed");

	}
	public String toString() {
		return " broke";
	}
}
