package ru.job4j;

import java.util.Arrays;
/**
 *Class Duplicate удаляет из массива строк дубли.
 *
 *@author gkachalov
 *@since 29.01.2016
 *@version 1
 */
 public class Duplicate {
	/**
	 *Method deleteDuplicates удаляет из массива строк дубли (повторяющиеся строки).
	 *@param array - исходный массив
	 *@return массив без дублей
	 */
	 public String[] deleteDuplicates(String[] array) {
		 int count = 0;
		 int j = 1;
		 String temp;
		 while (count + j < array.length) {
			 for (int i = 0; i < j; i++) {
				 if (array[i].equals(array[j])) {
					 temp = array[array.length - 1 - count];
					 array[array.length - 1 - count] = array[j];
					 array[j] = temp;
					 count++;
				 }
			 }
			 j++;
		 }
		 return Arrays.copyOf(array, array.length - count);
	 }
 }