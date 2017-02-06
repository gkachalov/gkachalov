package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test Duplicate Class.
 *@author gkachalov
 *@since 26.01.2016
 *@version 1
 */
 public class DuplicateTest {
	/**
	 *Test method deleteDuplicates для удаления дублей из массива строк. Массив из 4 строк, 2 повторяющиеся.
	 */
	 @Test
	 public void testDeleteDuplicateFromArrayOfFour() {
		  final String[] array = {"Привет", "Привет", "Мир", "Мир"};
		  String[] expectArray = {"Привет", "Мир"};
		  Duplicate duplicate = new Duplicate();
		  assertThat(duplicate.deleteDuplicates(array), is(expectArray));
	 }
 }