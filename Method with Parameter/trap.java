class trap 
{
	static void Area( int a,int b,int h)
	{ 
		double c=0.5;
		
		double d = c*(a+b)*h;
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		System.out.println("***Main Starts***");

			Area(5,2,6);

		System.out.println("***Main Ends***");
	}
}

