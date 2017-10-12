package DecoratorPattern;

//We extend BeverageType class, since DarkRoast is a BeverageType
public class DarkRoast extends BeverageType{
	
	public DarkRoast(){					//To take care of the detail, we set it in 
		detail = "Dark Roast Coffee";  	//the constructor. detail instance variable
	}									//is inherited from base class (BeverageType)
	
	public double cost(){				//Finally we just need to return the cost of 
		return .99;					//Dark Roast Coffee, we don't have to 
	}									//worry about the adding Ingredients in this
										//class. 
}
