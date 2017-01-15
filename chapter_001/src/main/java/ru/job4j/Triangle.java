package ru.job4j;

/**
 *Class Triangle для расчета площади треугольника abc.
 *
 *@author gkachalov
 *@since 12.01.2016
 *@version 1
 */
 public class Triangle {
	/**
	 *Точка а.
	 */
	 private Point a;
	/**
	 *Точка b.
	 */
	 private Point b;
	/**
	 *Точка c.
	 */
	 private Point c;
	/**
	 *Конструктор для описания треугольника abc.
	 *@param a - точка a
	 *@param b - точка b
	 *@param c - точка c
	 */
	 public Triangle(Point a, Point b, Point c) {
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
	/**
	 *Метод для вычисления площади треугольника abc.
	 *@return возвращает 0, если треугольника не существует
	 */
	 public double area() {
		 double sideAB = a.distanceTo(b);
		 double sideBC = b.distanceTo(c);
		 double sideAC = a.distanceTo(c);
		 double result;
		/**
		 *Проверка на существование треугольника.
		 */
		 boolean existTriangle = ((sideAB + sideBC > sideAC) & (sideBC + sideAC > sideAB) & (sideAB + sideAC >= sideBC));
		 if (existTriangle) {
			 double semiPerimeter = (sideAB + sideBC + sideAC) / 2;
			 result = Math.sqrt(semiPerimeter * (semiPerimeter - sideAB) * (semiPerimeter - sideBC) * (semiPerimeter - sideAC));
		 } else {
			 result = 0;
		 }
		 return result;
	 }
 }