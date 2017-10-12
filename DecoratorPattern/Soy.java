package DecoratorPattern;

//Soy is an Ingredient
public class Soy extends IngredientsDecorator{ //we can do this, since IngredientsDecorator extends BeverageType
	
	BeverageType beverage;					//We're going to instantiate Soy with a reference to a BeverageType
											//1. An instance variable to hold the beverage we are wrapping
	public Soy(BeverageType beverage){		//2. A way to set this instance variable to the object we are 
		this.beverage = beverage;			//wrapping. Here, we're going to pass the beverage we're wrapping
	}										//to the Ingredient's constructor
	
	@Override
	public String getDetails(){						//We want out details to not only include the beverage, but 
		return beverage.getDetails() + ", Soy";		//also to include each item decorating the beverage, for instance.
	}												//So we first delegate to the object we are decorating to get its
													//detail, then append ", Soy" to that detail
	
	
	public double cost(){				
										//Now we need to calculate the cost of our beverage with Soy.
		return .40 + beverage.cost();	//First, we delegate the call the he object we're decorating, so
								//that it can compute the cost; then, we add the cost of Soy to the result
	}
}
