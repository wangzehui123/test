package javaAndDos;

import java.io.File;

public class ModifyFileName {
	public static void main(String[] agrs) {
		cautiousName();
	}
	
	/**
	 * 数据显示
	 * @param list
	 */
	public static void name(String[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
	
	/**
	 * 将prohibit文件夹下的文件统一命名
	 */
	public static void prohibitName() {
		File file = new File("C:\\Users\\nick\\Desktop\\prohibit");
		String[] list = file.list();
		File file1 = null;
		for (int i = 0; i < list.length; i++) {
			file1 = new File(file,list[i]);
			File tempFile = new File(file,"Prohibit-"+(i+1)+".py");
			if (file1.exists()) {
				file1.renameTo(tempFile);
			}
		}
		name(file.list());
	}
	
	/**
	 * 将cautious目录下的文件统一命名
	 */
	public static void cautiousName() {
		File file = new File("C:\\Users\\nick\\Desktop\\cautious");
		String[] list = file.list();
		File file1 = null;
		for (int i = 0; i < list.length; i++) {
			file1 = new File(file,list[i]);
			File tempFile = new File(file,"Cautious-"+(i+1)+".py");
			if (file1.exists()) {
				file1.renameTo(tempFile);
			}
		}
		name(file.list());
	}
}
