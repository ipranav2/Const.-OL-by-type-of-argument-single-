class Test
{
	Test(float f)
	{
		System.out.println("first constructor");
	}
	Test(int x)
	{
		System.out.println("second constructor");
	}
	public static void main(String S[])
	{
		new Test(5.5f);
		new Test(55);
		new Test('A');
	}
}