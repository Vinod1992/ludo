package ludo.states;

public class Context {

	private IState state;
	
	public Context() {
		this.state = new State1();
	}
	
	public void handle() {
		this.state = this.state.handleState();
	}
	
}
