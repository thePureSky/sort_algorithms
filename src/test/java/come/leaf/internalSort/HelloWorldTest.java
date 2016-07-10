package come.leaf.internalSort;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple HelloWorld.
 */
public class HelloWorldTest 
{
	@Test
    public void testSayHello()
    {
		System.out.println("1");
        HelloWorld helloWorld = new HelloWorld();

		String result = helloWorld.sayHello();

		assertEquals("Hello Maven", result);
    }

	@Test
    public void testSayHello2()
    {
		System.out.println("2");
        HelloWorld helloWorld = new HelloWorld();

		String result = helloWorld.sayHello();

		assertEquals("Hello Maven", result);

	}
}

