package ru.job4j;

/**
 *Class Класс для выполнения операций сложения, вычитания, умножения и деления.
 *
 *@author gkachalov
 *@since 10.01.2016
 *@version 1
 */
 public class Calculator {
	 /**
	  *result - переменная для хранения результата вычислений.
	  */
	 private double result;
	 /**
	  *Метод add - метод сложения.
	  *@param first - первое слагаемое
	  *@param second - второе слагаемое
	  */
	 public void add(double first, double second) {
		result = first + second;
	 }
	 /**
	  *Метод subtraction - метод вычитания.
	  *@param first - уменьшаемое
	  *@param second - вычитатель
	  */
	 public void subtraction(double first, double second) {
		result = first - second;
	 }
	 /**
	  *Метод div - метод деления.
	  *@param first - делимое
	  *@param second - делитель
	  */
	 public void div(double first, double second) {
		result = first / second;
	 }
	 /**
	  *Метод multiplication - метод умножения.
	  *@param first - умножаемое
	  *@param second - множитель
	  */
	 public void multiplication(double first, double second) {
		result = first * second;
	 }
	 /**
	  *Метод getResult - метод возврата результата.
	  *@return result
	  */
	 public double getResult() {
		 return result;
	 }
 }