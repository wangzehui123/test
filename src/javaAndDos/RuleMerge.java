package javaAndDos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class RuleMerge {
	public static void main(String[] args) throws IOException {
		getCautious();
	}

	public static void getProhibit() throws IOException, FileNotFoundException {
		File file = new File("C:\\Users\\nick\\Desktop\\安全子集规则整理\\prohibit");
		File filew = new File("C:\\Users\\nick\\Desktop\\安全子集规则整理\\prohibit.py");
		BufferedWriter bw = new BufferedWriter(new FileWriter(filew, true));
		String[] s = file.list();
		for (int i = 0; i < s.length; i++) {
			BufferedReader br = new BufferedReader(new FileReader(new File(file,s[i])));
			String string = null;
			while ((string = br.readLine()) != null) {
				bw.write(string);
				bw.newLine();
			}
			bw.newLine();
			bw.flush();
			br.close();
		}
		bw.close();
		System.out.println("成功");
	}
	
	public static void getCautious() throws IOException {
		File file = new File("C:\\Users\\nick\\Desktop\\安全子集规则整理\\cautious");
		File filew = new File("C:\\Users\\nick\\Desktop\\安全子集规则整理\\cautious.py");
		BufferedWriter bw = new BufferedWriter(new FileWriter(filew, true));
		String[] s = file.list();
		for (int i = 0; i < s.length; i++) {
			BufferedReader br = new BufferedReader(new FileReader(new File(file,s[i])));
			String string = null;
			while ((string = br.readLine()) != null) {
				bw.write(string);
				bw.newLine();
			}
			bw.newLine();
			bw.flush();
			br.close();
		}
		bw.close();
		System.out.println("成功");
	}
}
