package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrisation {
	@Parameters("tool")
	@Test
	public void test(String tool) {
		System.out.println(tool);
	}
}
