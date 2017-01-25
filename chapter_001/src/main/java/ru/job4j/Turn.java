package ru.job4j;

/**
 *Class Turn для "переворачивания" массива в обратном порядке.
 *
 *@author gkachalov
 *@since 25.01.2016
 *@version 1
 */
 public class Turn {
	/**
	 *Method back для "переворачивания" массива в обратном порядке.
	 *@param massive - массив
	 *@return возвращает "перевернутый" массив
	 */
	 public int[] back(int[] massive) {
		 for (int i = 0; i < massive.length / 2; i++) {
			 int temp = massive[i];
			 massive[i] = massive[massive.length - i - 1];
			 massive[massive.length - i - 1] = temp;
		 }
		 return massive;
	 }
 }