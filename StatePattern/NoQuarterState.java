package StatePattern;
//First we need to implement the State interface
public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    
    
    //we get passed a reference to the Gumball Machine through the
    //constructor. We're just going to stash this in an instace variable
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    //If someone inserts a quarter, we print a message saying the quarter
    //we accepted and then change the machine's state to 
    //the HasQuarterState
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	//You can't get money back if you never gave it to us!
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	//And, you can't get a gumball if you don't pay us.
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	//We can't dispense gumballs without payment
	public void dispense() {
		System.out.println("You need to pay first");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for quarter";
	}
}