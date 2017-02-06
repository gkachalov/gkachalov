package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test Square Class.
 *@author gkachalov
 *@since 30.01.2016
 *@version 1
 */
 public class SquareTest {
	/**
	 *Test method rotateArray для поворота квадратного массива на 90 градусов. Квадратный массив из 3 строк и столбцов.
	 */
	 @Test
	 public void testRotateThree() {
		  final int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		  final int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		  Square rotate = new Square();
		  assertThat(rotate.rotateArray(array), is(expectArray));
	 }
 }