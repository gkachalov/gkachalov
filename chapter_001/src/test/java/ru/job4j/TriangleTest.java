package ru.job4j;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 *Test.
 *@author gkachalov
 *@since 13.01.2016
 *@version 1
 */
 public class TriangleTest {
	/**
	 * Number 0.0.
	 */
	private final double zero = 0.0;
	/**
	 * Number 0.0.
	 */
	private final double half = 0.5;
	/**
	 * Number 1.0.
	 */
	private final double one = 1.0;
	/**
	 * Number 2.0.
	 */
	private final double two = 2.0;
	/**
	 * Number 0.51.
	 */
	private final double error = 0.51;
	/**
	 *Test calculation area. The triangle exist.
	 */
	 @Test
	 public void testTriangleExist() {
		  Point pointA = new Point(one, one);
		  Point pointB = new Point(one, two);
		  Point pointC = new Point(two, two);
		  Triangle triangle = new Triangle(pointA, pointB, pointC);
		  assertThat(pointA.distanceTo(pointB), closeTo(half, error));
	 }
	 /**
	 *Test calculation area. The triangle does not exist (pointB = pointC).
	 */
	 @Test
	 public void testTriangleDoesNotExistPointBEqualsPoinC() {
		  Point pointA = new Point(one, one);
		  Point pointB = new Point(one, two);
		  Point pointC = new Point(one, two);
		  Triangle triangle = new Triangle(pointA, pointB, pointC);
		  assertThat(triangle.area(), is(zero));
	 }
	 /**
	 *Test calculation area. The triangle does not exist (pointB = pointC).
	 */
	 @Test
	 public void testTriangleDoesNotExistPointAEqualsPointB() {
		  Point pointA = new Point(one, one);
		  Point pointB = new Point(one, one);
		  Point pointC = new Point(one, two);
		  Triangle triangle = new Triangle(pointA, pointB, pointC);
		  assertThat(triangle.area(), is(zero));
	 }
 }