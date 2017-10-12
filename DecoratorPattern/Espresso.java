package DecoratorPattern;

//We extend BeverageType class, since Espresso is a BeverageType
public class Espresso extends BeverageType{
	
	public Espresso(){					//To take care of the detail, we set it in 
		detail = "Espresso";  			//the constructor. detail instance variable
	}									//is inherited from base class (BeverageType)
	
	public double cost(){				//Finally we just need to return the cost of 
		return 1.90;					//Espresso, we don't have to 
	}									//worry about the adding Ingredients in this
										//class. 

}
