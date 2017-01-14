package ru.job4j;

/**
 *Class Point. Класс для описания точки в системе координат (x,y).
 *
 *@author gkachalov
 *@since 12.01.2016
 *@version 1
 */
 public class Point {
	/**
	 *Координата по оси x.
	 */
	 private double x;
	/**
	 *Координата по оси y.
	 */
	 private double y;
	/**
	 *Конструктор для описания координат точки.
	 *@param x - координата по оси х
	 *@param y - координата по оси y
	 */
	 public Point(double x, double y) {
		 this.x = x;
		 this.y = y;
	 }
	/**
	 *Метод расчета расстояния между точками.
	 *@param point - точка
	 *@return - расстояние между точками
	 */
	 public double distanceTo(Point point) {
		 return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
	 }
 }