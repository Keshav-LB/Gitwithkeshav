package Classes_and_Objects;

public class Box {
	
	private double width;
	private double height;
	private double depth;
	
	Box(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double getVolume() {
		return width * height * depth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box(10,5,2);
		
		System.out.println("Total Volume: "+b.getVolume());

	}

}
