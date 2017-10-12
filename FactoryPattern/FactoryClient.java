package FactoryPattern;

public class FactoryClient {

	public static void main(String[] args) {
		GetShape GS = new GetShape();
		
		Shape shape1 = GS.getShape("circle");
		shape1.draw();
		
		Shape shape2 = GS.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = GS.getShape("square");
		shape3.draw();
	}
}
