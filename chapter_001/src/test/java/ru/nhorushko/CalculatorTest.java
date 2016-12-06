package ru.nhorushko;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//
@Test
public void whenExecuteMainThenPrintToConsole(){
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	Calculator.main(null);
	assertThat(out.toString(), is("HelloWorld\r\n"))
}