package ru.job4j;

/**
 *Class Factorial для вычисления факториала.
 *
 *@author gkachalov
 *@since 20.01.2016
 *@version 1
 */
 public class Factorial {
	/**
	 *Method factorial для для вычисления факториала числа num.
	 *@param num - число, из которого вычисляем факториал
	 *@return result - возвращает факториал числа num
	 */
	 public int factorial(int num) {
		 int result = 1;
		 if (num < 0) {
			 result = 0;
		 } else if ((num == 0) || (num == 1)) {
			 result = 1;
		 } else {
			 for (int i = 1; i <= num; i++) {
				 result *= i;
			 }
		 }
		 return result;
	 }
 }