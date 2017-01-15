package ru.job4j;

/**
 *Class Max для нахождения max из 2 и 3 чисел.
 *
 *@author gkachalov
 *@since 15.01.2016
 *@version 1
 */
 public class Max {
	/**
	 *Method max для нахождения max из 2 чисел.
	 *@param first - first number
	 *@param second - second number
	 *@return возвращает max из 2 чисел
	 */
	 public int max(int first, int second) {
		return (first >= second) ? first : second;
	 }
	/**
	 *Method max для нахождения max из 3 чисел.
	 *@param first - first number
	 *@param second - second number
	 *@param third - third number
	 *@return возвращает max значение из 3 чисел
	 */
	 public int max(int first, int second, int third) {
		return max(max(first, second), third);
	 }
 }