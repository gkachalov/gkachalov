package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test Sort Class.
 *@author gkachalov
 *@since 26.01.2016
 *@version 1
 */
 public class SortTest {
	/**
	 *Test method sort для сортировки массива методом перестановки. Массив из 4 чисел.
	 */
	 @Test
	 public void testTurnFour() {
		  final int[] array = {3, 4, 2, 1};
		  final int[] expectArray = {1, 2, 3, 4};
		  Sort bubble = new Sort();
		  bubble.sort(array);
		  assertThat(array, is(expectArray));
	 }
 }