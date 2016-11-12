package se.henriks;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;


public class CalculatorTest
{
	Calculator calculator = new Calculator();

	@Test
	public void testSum() throws Exception
	{
		assertEquals(2, calculator.sum(1,1));
	}
}