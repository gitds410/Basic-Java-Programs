class sector
{
	static double area()
	{ 
		double a= 0.5;
		int r = 5;
		int theta = 45;
		double c = a*r*r*theta;
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
