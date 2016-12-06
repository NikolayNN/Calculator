package ru.nhorushko;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test for Calculator.
*/
public class CalculatorTest {
	/**
	* Test for main().
	*/
	@Test
	public void whenExecuteMainThenPrintToConsole() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculator.main(null);
		assertThat(out.toString(), is("Hello world\r\n"));
	}
}