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
	 *Test method factorial. Вычисление факториала числа 6.
	 */
	 @Test
	 public void testFactorialTen() {
		  Factorial fact = new Factorial();
		  final int three = 3;
		  final int six = 6;
		  assertThat(fact.factorial(three), is(six));
	 }
	/**
	 *Test method factorial. Вычисление факториала числа -6.
	 */
	 @Test
	 public void testFactorialMinusSix() {
		  Factorial fact = new Factorial();
		  final int zero = 0;
		  final int minusSix = -6;
		  assertThat(fact.factorial(minusSix), is(zero));
	 }
	/**
	 *Test method factorial. Вычисление факториала числа 0.
	 */
	 @Test
	 public void testFactorialZero() {
		  Factorial fact = new Factorial();
		  final int zero = 0;
		  final int one = 1;
		  assertThat(fact.factorial(zero), is(one));
	 }
	/**
	 *Test method factorial. Вычисление факториала числа 1.
	 */
	 @Test
	 public void testFactorialOne() {
		  Factorial fact = new Factorial();
		  final int one = 1;
		  assertThat(fact.factorial(one), is(one));
	 }
 }