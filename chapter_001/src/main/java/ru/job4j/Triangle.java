package ru.job4j;

/**
 *Class Triangle ��� ������� ������� ������������ abc.
 *
 *@author gkachalov
 *@since 12.01.2016
 *@version 1
 */
 public class Triangle {
	/**
	 *����� �.
	 */
	 private Point a;
	/**
	 *����� b.
	 */
	 private Point b;
	/**
	 *����� c.
	 */
	 private Point c;
	/**
	 *����������� ��� �������� ������������ abc.
	 *@param a - ����� a
	 *@param b - ����� b
	 *@param c - ����� c
	 */
	 public Triangle(Point a, Point b, Point c) {
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
	/**
	 *����� ��� ���������� ������� ������������ abc.
	 *@return ���������� 0, ���� ������������ �� ����������
	 */
	 public double area() {
		 double sideAB = a.distanceTo(b);
		 double sideBC = b.distanceTo(c);
		 double sideAC = a.distanceTo(c);
		 double result;
		/**
		 *�������� �� ������������� ������������.
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