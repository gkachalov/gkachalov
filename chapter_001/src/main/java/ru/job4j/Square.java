package ru.job4j;

/**
 *Class Square для поворота квадратного массива на 90 градусов.
 *
 *@author gkachalov
 *@since 29.01.2016
 *@version 1
 */
 public class Square {
	/**
	 *Method rotateArray для поворота квадратного массива на 90 градусов.
	 *@param values - массив
	 *@return array - возвращает массив, повернутый на 90 градусов массив
	 */
	 public int[][] rotateArray(int[][] values) {
		 int[][] array = new int[values.length][values.length];
		 int n = values.length - 1;
		 for (int i = 0; i < values.length; i++) {
			 for (int j = 0; j < values.length; j++) {
				 array[j][n] = values[i][j];
			 }
			 n--;
		 }
		 return array;
	 }
 }