package testing;

import org.testng.Assert;
import org.testng.annotations.*;

public class A {

	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void sub(int a, int b)
	{
		System.out.println(a-b);
		System.out.println("Hello");
	}
}
