class sector
{
	static void Area( int r, int theta)
	{ 
		double a=0.5;
	
		
		double c = a*r*theta;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println("***Main Starts***");

			Area(5,40);

		System.out.println("***Main Ends***");
	}
}

