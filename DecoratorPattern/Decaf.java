package DecoratorPattern;

//We extend BeverageType class, since Decaf is a BeverageType
public class Decaf extends BeverageType{

	public Decaf(){						//To take care of the detail, we set it in 
		detail = "Decaf";  				//the constructor. detail instance variable
	}									//is inherited from base class (BeverageType)
	
	public double cost(){				//Finally we just need to return the cost of 
		return 1;					//Decaf, we don't have to 
	}									//worry about the adding Ingredients in this
										//class. 
	
}
