package TeatRunner;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Test1 {
     @Test
	public void test() {
		System.out.println("Hellow World 1 main Maan ja Bhai");
		String s="ali";
		Assert.assertEquals("ali", s);
		
     }
}
