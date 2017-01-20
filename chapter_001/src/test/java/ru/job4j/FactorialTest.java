package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test Factorial Class.
 *@author gkachalov
 *@since 20.01.2016
 *@version 1
 */
 public class FactorialTest {
	/**
	 * Number -6.
	 */
	private final int minusSix = -6;
	/**
	 * Number 0.
	 */
	private final int zero = 0;
	/**
	 * Number 1.
	 */
	private final int one = 1;
	/**
	 * Number 3.
	 */
	private final int three = 3;
	/**
	 * Number 6.
	 */
	private final int six = 6;

	/**
	 *Test method factorial. Вычисление факториала числа 6.
	 */
	 @Test
	 public void testFactorialTen() {
		  Factorial fact = new Factorial();
		  assertThat(fact.factorial(three), is(six));
	 }
	/**
	 *Test method factorial. Вычисление факториала числа -6.
	 */
	 @Test
	 public void testFactorialMinusSix() {
		  Factorial fact = new Factorial();
		  assertThat(fact.factorial(minusSix), is(zero));
	 }
	/**
	 *Test method factorial. Вычисление факториала числа 0.
	 */
	 @Test
	 public void testFactorialZero() {
		  Factorial fact = new Factorial();
		  assertThat(fact.factorial(zero), is(one));
	 }
	/**
	 *Test method factorial. Вычисление факториала числа 1.
	 */
	 @Test
	 public void testFactorialOne() {
		  Factorial fact = new Factorial();
		  assertThat(fact.factorial(one), is(one));
	 }
 }