class square
{
	static double area()
	{ 
		
		int r = 5;
		double c = r*r;
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
