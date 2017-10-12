package FactoryPattern;

public class GetShape {
	
	public Shape getShape(String str){
		if(str == null) return null;
		if(str.equalsIgnoreCase("circle")) return new Circle();
		if(str.equalsIgnoreCase("rectangle")) return new Rectangle();
		if(str.equalsIgnoreCase("square")) return new Square();
		return null;
	}

}
