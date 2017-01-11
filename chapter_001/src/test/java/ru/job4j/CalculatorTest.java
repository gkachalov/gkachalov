package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *@author gkachalov
 *@since 10.01.2016
 *@version 1
 */
 public class CalculatorTest {
	/**
	 * Number 0.0.
	 */
	private final double zero = 0.0;
	/**
	 * Number 1.0.
	 */
	private final double one = 1.0;
	/**
	 * Number 2.0.
	 */
	private final double two = 2.0;
	/**
	 * Number 3.5.
	 */
	private final double threeWithHalf = 3.5;
	/**
	 * Number 7.0.
	 */
	private final double seven = 7.0;
	/**
	 *Test add method. 1+1=2.
	 */
	 @Test
	 public void whenAddOnePlusOneThenTwo() {
		  Calculator calc = new Calculator();
		  calc.add(one, one);
		  assertThat(calc.getResult(), is(two));
	 }
	/**
	 *Test subtraction method. 2-1=1.
	 */
	 @Test
	 public void whenSubstractionTwoMinusOneThenOne() {
		  Calculator calc = new Calculator();
		  calc.subtraction(two, one);
		  assertThat(calc.getResult(), is(one));
	 }
	/**
	 *Test div method. 7/2=3.5.
	 */
	 @Test
	 public void whenDivSevenDivTwoThenThreeWithHalf() {
		  Calculator calc = new Calculator();
		  calc.div(seven, two);
		  assertThat(calc.getResult(), is(threeWithHalf));
	 }
	/**
	 *Test multiplication method. 2*3.5=7.
	 */
	 @Test
	 public void whenMultiplicationTwoAndThreeWithHalfThenSeven() {
		  Calculator calc = new Calculator();
		  calc.multiplication(two, threeWithHalf);
		  assertThat(calc.getResult(), is(seven));
	 }
 }