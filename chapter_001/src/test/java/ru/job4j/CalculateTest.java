package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *Test
 *@author gkachalov
 *@since 06.01.2016
 *@version $Id$
 */
public class CalculateTest {
	/**
	*Test
	*/	
	@Test
	public void whenExecuteMainThenPrintToConsole () { 
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assertThat(out.toString(), is("Hello world!\r\n"));
	}
	
	
		
	
}