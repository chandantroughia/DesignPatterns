package DecoratorPattern;

public class Starbucks {

	public static void main(String[] args) {
		BeverageType espresso = new Espresso();		//Order up an Espresso, no Ingredients and print 
													//its description and cost.
		BeverageType DarkRoast = new DarkRoast();
		BeverageType HouseBlend = new HouseBlend();
		BeverageType Decaf = new Decaf();
		
		
		System.out.println("---------------------Starbucks Menu--------------------------");
		System.out.println(espresso.getDetails()+ ":           $" + espresso.cost());
		System.out.println(DarkRoast.getDetails()+ ":  $" + DarkRoast.cost());
		System.out.println(HouseBlend.getDetails()+ ": $" + HouseBlend.cost());
		System.out.println(Decaf.getDetails()+ ":              $" + Decaf.cost());
		System.out.println();
		System.out.println("---------------------Ingredients-----------------------------");
		System.out.println("Milk:  $0.20");
		System.out.println("Mocha: $0.20");
		System.out.println("Soy:   $0.40");
		System.out.println("Whip:  $0.10");
		System.out.println();
		
		
		
		System.out.println("---------------------Orders Below-----------------------------");
		System.out.println();
		BeverageType beverage2 = new DarkRoast(); //Make a Dark Roast object
		beverage2 = new Milk(beverage2);		  //Wrap it with a Milk
		beverage2 = new Mocha(beverage2);		  //Wrap it in a second Mocha
		beverage2 = new Whip(beverage2);		  //Wrap it in a Whip
		System.out.println(beverage2.getDetails() + " => $" + beverage2.cost());
		System.out.println();
		
		
		BeverageType beverage3 = new HouseBlend(); //HouseBlend with Soy, Mocha and Whip
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDetails() + " => $" + beverage3.cost());
		System.out.println();
		
		
		BeverageType beverage4 = new Espresso(); //Espresso with Soy and Mocha
		beverage4 = new Soy(beverage4);
		beverage4 = new Mocha(beverage4);
		System.out.println(beverage4.getDetails() + " => $" + beverage4.cost());
		System.out.println();
		
		
		BeverageType beverage5 = new Decaf(); //Decaf with Whip and Mocha
		beverage5 = new Whip(beverage5);
		beverage5 = new Mocha(beverage5);
		System.out.println(beverage5.getDetails() + " => $" + beverage5.cost());
		System.out.println();
		
	}
	
}
