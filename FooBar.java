
public class FooBar
{
	public static void main(String[] args)
	{
		fooBar(100);
	}
	
	public static void fooBar(int i)
	{
		for(int x = 1; x < i; x++)
		{
			if((x % 5) == 0 && (x % 3) == 0)
			{
				System.out.println("FooBar");
			}
			else if((x % 5) == 0)
			{
				System.out.println("Foo");
			}
			else if((x % 3) == 0)
			{
				System.out.println("Bar");
			}
			else
			{
				System.out.println(x);
			}
			
		}
	}
}
