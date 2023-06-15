import java.util.ArrayList;
import java.util.List;

public class allShapes {
	private List<Shape> S;    

    public allShapes() {
        S = new ArrayList<>();
    }

	public void addShape(Shape b) throws MaxShapesException {
		if (S.size()<3) { 
			S.add(b);
	} else {
            throw new MaxShapesException("Too many Shapes");
        }
	}
	
	public void removeShape(Shape Shape)throws ShapeNotFoundException {
        if (S.remove(Shape)) {
            System.out.println("Shape removed successfully.");
        } else {
            throw new ShapeNotFoundException("Shape not found in the collection.");
        }
	}
	
	public void printAllAreas() {
		for (Shape Shape : S) {
		System.out.println (Shape.getArea());
		
	}
	}
}