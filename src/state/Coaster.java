package state;

public class Coaster {
	State breakState;
	State buyState;
	State serveState;
	State washState;
	
	State state;
	public Coaster() {
		breakState = new BreakState(this);
		buyState = new BuyState(this);
		serveState = new ServeState(this);
		washState = new WashState(this);
		
		state = buyState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getBreakState() {
		return breakState;
	}
	public State getWashState() {
		return washState;
	}
	public State getServeState() {
		return serveState;
	}
	public State getBuyState() {
		return buyState;
	}
	public void washCoaster() {
		state.washCoaster();
	}
	public void breakCoaster() {
		state.breakCoaster();
	}
	public void serveCoaster() {
		state.serveCoaster();
	}
	public void buyCoaster() {
		state.buyCoaster();
	}
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("\n------------Zinc Mini Bar -----------\n");
		buffer.append("Coaster " + state + "\n");
		return buffer.toString();
	}

}
