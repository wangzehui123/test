package javaAndDos;

import java.awt.print.Printable;


public class ProjectObtain {
	public static void main(String[] args) {
//		String string = new String("[src [in demoTest]\r\n" + 
//				"  <default> (...)\r\n" + 
//				"  demojava (...)\r\n" + 
//				"  fun (...)]");
		String string = new String("[[Working copy] JavaTest2.java [in fun [in src [in demoTest]]]\r\n" + 
				"  package fun\r\n" + 
				"  class JavaTest2]");
		System.out.println(string);
		System.out.println(string.length());
		int i = string.indexOf("\r\n");
		int j = string.indexOf(".java");
		System.out.println(i);
		System.out.println(j);
		System.out.println(string.substring(j==-1?0:j+5, i));
		String[] sarr = string.split("[in");
		for (int k = 0; k < sarr.length; k++) {
			
		}
	}
}
