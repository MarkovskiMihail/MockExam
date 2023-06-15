

public class ShapesProgram {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(1,2);
		Rectangle r2 = new Rectangle(2,4);
		Circle c1 = new Circle(5);
			
		allShapes allShapes = new allShapes();
		
		try {
		allShapes.addShape(r1);
		} catch (MaxShapesException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		allShapes.addShape(r2);
		} catch (MaxShapesException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			allShapes.removeShape(c1);
        } catch (ShapeNotFoundException e) {
            System.out.println(e.getMessage());
        }
		
		allShapes.printAllAreas();
		
	}
	}


