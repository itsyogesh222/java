package Final;

public class examplefunctional implements shape1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	shape1 triangleObj = () -> {int l = 3, h = 5;double ans = 0.5 * l * h;System.out.println("Area of Triangle: " + ans);};

	      
   shape1 circleObj = () -> {int r = 3 ;double ans = 0.5 * r * r; System.out.println("Area of Circle: " + ans);};

       
        triangleObj.area();
        circleObj.area();
    }

		
		
		
	



	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}
