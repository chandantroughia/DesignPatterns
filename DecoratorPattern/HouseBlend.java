package DecoratorPattern;

//We extend BeverageType class, since HouseBlend is a BeverageType
public class HouseBlend extends BeverageType{
	
	public HouseBlend(){				//To take care of the detail, we set it in 
		detail = "House Blend Coffee";  //the constructor. detail instance variable
	}									//is inherited from base class (BeverageType)
	
	public double cost(){				//Finally we just need to return the cost of 
		return 1;					//House Blend Coffee, we don't have to 
	}									//worry about the adding Ingredients in this
										//class. 
}
