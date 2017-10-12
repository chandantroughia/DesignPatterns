package DecoratorPattern;


//BeverageType is an abstract type with two methods i.e. getDetails() and cost()
public abstract class BeverageType {
	
	String detail = "Unknown Beverage";
	
	public String getDetails(){		//getDetails() is already implemented
		return detail;				//but we need to implement cost() in 
	}								//in the subclass.
	
	public abstract double cost();
	
}
