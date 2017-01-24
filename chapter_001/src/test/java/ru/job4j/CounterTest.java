package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test Counter Class.
 *@author gkachalov
 *@since 16.01.2016
 *@version 2
 */
 public class CounterTest {
	/**
	 *Test method add. Вычисление суммы четных чисел от 1 до 10.
	 */
	 @Test
	 public void testSumFromOneToTen() {
		  Counter sum = new Counter();
		  final int one = 1;
		  final int ten = 10;
		  final int thirteen = 30;
		  assertThat(sum.add(one, ten), is(thirteen));
	 }
 }