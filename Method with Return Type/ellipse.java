class ellipse
{
	static double area()
	{ 
		double p= 3.14;
		int a = 5;
		int b = 10;
		double c = p*a*b;
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