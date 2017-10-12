package MVC;

public class Model {

	private int total;
	
	public void calculate(int first, int second){
		total = first + second;
	}
	
	public int getTotal(){
		return total;
	}
}
