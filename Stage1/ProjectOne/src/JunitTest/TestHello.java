package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.HelloWorld;

public class TestHello {

	HelloWorld h = new HelloWorld();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		int temp = h.printHello();
		assertEquals(temp, 1);
	}
	
}
