package DecoratorPattern;

/*Lets implement an abstract class for Ingredients (DECORATOR) as well.*/

//First we need to be interchangeable with a BeverageType so we extend it.
public abstract class IngredientsDecorator extends BeverageType {
	
	public abstract String getDetails(); //we also need that the Ingredients
										 //decorators all re-implement 
										 //the getDetails method.
}
