class circle
{
	static double area()
	{ 
		double a= 3.14;
		int r = 5;
		double c = a*r*r;
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
