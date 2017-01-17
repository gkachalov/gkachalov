package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test Counter Class.
 *@author gkachalov
 *@since 16.01.2016
 *@version 1
 */
 public class CounterTest {
	/**
	 * Number 1.
	 */
	private final int one = 1;
	/**
	 * Number 10.
	 */
	private final int ten = 10;
	/**
	 * Number 30.
	 */
	private final int thirteen = 30;
	/**
	 *Test method add. Вычисление суммы четных чисел от 1 до 10.
	 */
	 @Test
	 public void testSumFromOneToTen() {
		  Counter sum = new Counter();
		  assertThat(sum.add(one, ten), is(thirteen));
	 }
 }