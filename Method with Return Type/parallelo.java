class parallelo
{
	static double area()
	{ 
		double b= 6;
		int h = 5;
		double c = b*h;
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