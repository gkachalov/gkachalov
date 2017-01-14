package ru.job4j;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *@author gkachalov
 *@since 13.01.2016
 *@version 1
 */
 public class PointTest {
	/**
	 * Number 1.0.
	 */
	private final double one = 1.0;
	/**
	 * Number 2.0.
	 */
	private final double two = 2.0;
	/**
	 * error Number 2.01.
	 */
	private final double error = 2.01;
	/**
	 *Test distanceTo метода расчета расстояния между точками.
	 */
	 @Test
	 public void testCalculationDistanceTo() {
		  Point pointA = new Point(one, one);
		  Point pointB = new Point(one, two);
		  assertThat(pointA.distanceTo(pointB), closeTo(two, error));
	 }
 }