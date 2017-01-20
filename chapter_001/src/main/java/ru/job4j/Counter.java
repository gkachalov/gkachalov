package ru.job4j;

/**
 *Class Counter для вычисления суммы четныx чисел от start до finish.
 *
 *@author gkachalov
 *@since 15.01.2016
 *@version 1
 */
 public class Counter {
	/**
	 *Method add для для вычисления суммы четныx чисел от start до finish.
	 *@param start - first number
	 *@param finish - last number
	 *@return sum
	 */
	 public int add(int start, int finish) {
		 int sum = 0;
		 for (int index = start; index <= finish; index++) {
			 if (index % 2 == 0) {
				 sum += index;
			 }
		 }
		 return sum;
	 }
 }