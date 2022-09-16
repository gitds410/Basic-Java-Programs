class trape
{
	static double area()
	{ 
		double v = 0.5;
		int a = 5;
		int b = 6;
		int h = 8;
		double c = v*a*b*h;
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
