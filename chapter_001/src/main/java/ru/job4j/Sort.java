package ru.job4j;

/**
 *Class Sort для сортировки массива методом перестановки.
 *
 *@author gkachalov
 *@since 26.01.2016
 *@version 1
 */
 public class Sort {
	/**
	 *Method sort для сортировки массива методом перестановки.
	 *@param values - массив
	 *@return возвращает сортированный массив
	 */
	 public int[] sort(int[] values) {
		 for (int i = values.length - 1; i > 0; i--) {
			 for (int j = 0; j < i; j++) {
				 if (values[j] > values[j + 1]) {
					 int temp = values[j];
					 values[j] = values [j + 1];
					 values[j + 1] = temp;
				 }
			 }
		 }
		 return values;
	 }
 }