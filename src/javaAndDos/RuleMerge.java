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
		File file = new File("C:\\Users\\nick\\Desktop\\��ȫ�Ӽ���������\\prohibit");
		File filew = new File("C:\\Users\\nick\\Desktop\\��ȫ�Ӽ���������\\prohibit.py");
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
		System.out.println("�ɹ�");
	}
	
	public static void getCautious() throws IOException {
		File file = new File("C:\\Users\\nick\\Desktop\\��ȫ�Ӽ���������\\cautious");
		File filew = new File("C:\\Users\\nick\\Desktop\\��ȫ�Ӽ���������\\cautious.py");
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
		System.out.println("�ɹ�");
	}
}
