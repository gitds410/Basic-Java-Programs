class triangle
{
	static double area()
	{ 
		double a= 0.5;
		int b = 5;
		int h =5;
		double c = a*b*h;
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("***Main Starts***");
		double x = area();
		System.out.println(x);
		System.out.println("***Main Ends***");
	}
}