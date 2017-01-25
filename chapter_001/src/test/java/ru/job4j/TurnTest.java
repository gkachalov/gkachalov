package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test Turn Class.
 *@author gkachalov
 *@since 25.01.2016
 *@version 1
 */
 public class TurnTest {
	/**
	 *Test method back для "переворачивания" массива. Массив из 3 чисел.
	 */
	 @Test
	 public void testTurnThree() {
		  Turn massive = new Turn();
		  final int one = 1;
		  final int two = 2;
		  final int three = 3;
		  int[] array = {one, two, three};
		  int[] expectArray = {three, two, one};
		  Turn turn = new Turn();
		  assertThat(turn.back(array), is(expectArray));
	 }
	/**
	 *Test method back для "переворачивания" массива. Массив из 4 чисел.
	 */
	 @Test
	 public void testTurnFour() {
		  Turn massive = new Turn();
		  final int[] array = {1, 2, 3, 4};
		  final int[] expectArray = {4, 3, 2, 1};
		  Turn turn = new Turn();
		  turn.back(array);
		  assertThat(array, is(expectArray));
	 }
 }