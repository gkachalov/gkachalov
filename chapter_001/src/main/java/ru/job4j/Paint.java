package ru.job4j;

/**
 *Class Paint для построения пирамиды из пробелов и символа ^.
 *
 *@author gkachalov
 *@since 20.01.2016
 *@version 1
 */
 public class Paint {
	/**
	 *Method pyramid для построения пирамиды из пробелов и символа ^.
	 *@param h - высота пирамиды
	 *@return возвращает строку пирамиды
	 */
	 public String pyramid(int h) {
		 StringBuilder sBuilder = new StringBuilder();
		 if (h >= 1) {
			 for (int i = 0; i < h; i++) {
				 for (int j = 0; j < h - i; j++) {
					 sBuilder.append(" ");
				 }
				 for (int k = 0; k <= i; k++) {
					 sBuilder.append("^ ");
				 }
				 sBuilder.append("\n");
			 }
			 return sBuilder.toString();
		 } else {
			 return "error";
		 }
	 }
 }