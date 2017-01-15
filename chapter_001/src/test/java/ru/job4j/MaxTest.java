package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test max methods.
 *@author gkachalov
 *@since 15.01.2016
 *@version 1
 */
 public class MaxTest {
	/**
	 * Number 1.
	 */
	private final int one = 1;
	/**
	 * Number 2.
	 */
	private final int two = 2;
	/**
	 * Number 3.
	 */
	private final int three = 3;
	/**
	 *Test method max of 2 numbers: 1, 2.
	 */
	 @Test
	 public void testMaxOfTwoNumbersOneTwo() {
		  Max maximum = new Max();
		  assertThat(maximum.max(one, two), is(two));
	 }
	/**
	 *Test method max of 2 numbers: 2, 1.
	 */
	 @Test
	 public void testMaxOfTwoNumbersTwoOne() {
		  Max maximum = new Max();
		  assertThat(maximum.max(two, one), is(two));
	 }
	/**
	 *Test method max of 3 numbers: 1, 2, 3.
	 */
	 @Test
	 public void testMaxOfThreeNumbersOneTwoThree() {
		  Max maximum = new Max();
		  assertThat(maximum.max(one, two, three), is(three));
	 }
	/**
	 *Test method max of 3 numbers: 3, 2, 1.
	 */
	 @Test
	 public void testMaxOfThreeNumbersThreeTwoOne() {
		  Max maximum = new Max();
		  assertThat(maximum.max(three, two, one), is(three));
	 }
 }