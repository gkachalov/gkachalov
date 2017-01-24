package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test Paint Class.
 *@author gkachalov
 *@since 24.01.2016
 *@version 1
 */
 public class PaintTest {
	/**
	 *Test method pyramid для построения пирамиды из пробелов и символа ^. Пирамида из h = 0 строк.
	 */
	 @Test
	 public void testPyramidZero() {
		  Paint paint = new Paint();
		  final int zero = 0;
		  assertThat(paint.pyramid(zero), is("error"));
	 }
	/**
	 *Test method pyramid для построения пирамиды из пробелов и символа ^. Пирамида из h = 1 строки.
	 */
	 @Test
	 public void testPyramidOne() {
		  Paint paint = new Paint();
		  final int one = 1;
		  assertThat(paint.pyramid(one), is(" ^ \n"));
	 }
	/**
	 *Test method pyramid для построения пирамиды из пробелов и символа ^. Пирамида из h = 3 строк.
	 */
	 @Test
	 public void testPyramidThree() {
		  Paint paint = new Paint();
		  final int three = 3;
		  assertThat(paint.pyramid(three), is("   ^ \n  ^ ^ \n ^ ^ ^ \n"));
	 }
 }