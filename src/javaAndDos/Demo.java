package javaAndDos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] agrs) throws IOException {
		try {
//			Process process = Runtime.getRuntime().exec("cmd /c vera++ -R 4.1.1.17 C:\\Users\\nick\\Desktop\\test\\4.1.1.17.cpp >> C:\\Users\\nick\\Desktop\\te.txt");
//			Process process = Runtime.getRuntime().exec("cmd /c vera++ -R 4.1.1.17 C:\\Users\\nick\\Desktop\\test\\4.1.1.17-1.cpp");
//			Process process = Runtime.getRuntime().exec("C:\\Users\\nick\\Desktop\\test.bat");
			for (int i = 1; i <=20; i++) {
				//下列调用存在巨大的缺陷，每次调用都会产生一个新的子进程，会非常耗费系统资源。但是它的子进程存在时间非常的短。
				Process process = Runtime.getRuntime().exec("cmd /c vera++ -R 4.1.1."+i+" C:\\Users\\nick\\Desktop\\test\\4.1.1."+i+".cpp");
				process.waitFor();
				BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String s = null;
				while ((s=br.readLine()) != null) {
					System.err.println("Error:"+s);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		new Demo().fun();
	}
	public void fun() throws IOException {
		File file = new File("C:\\Users\\nick\\Desktop\\te.txt");
		System.out.println(file.exists());
		file.delete();
	}
	public void test() {
		try {
//			Process process = Runtime.getRuntime().exec("cmd /c vera++ -R 4.1.1.17 C:\\Users\\nick\\Desktop\\test\\4.1.1.17.cpp >> C:\\Users\\nick\\Desktop\\te.txt");
//			Process process = Runtime.getRuntime().exec("cmd /c vera++ -R 4.1.1.17 C:\\Users\\nick\\Desktop\\test\\4.1.1.17-1.cpp");
//			Process process = Runtime.getRuntime().exec("C:\\Users\\nick\\Desktop\\test.bat");
			ArrayList<String> cmdList = new ArrayList<String>();
			String[] cmd = new String[20];
			for (int i = 1; i <=20; i++) {
				//下列调用存在巨大的缺陷，每次调用都会产生一个新的子进程，会非常耗费系统资源。但是它的子进程存在时间非常的短。
//				Process process = Runtime.getRuntime().exec("cmd /c vera++ -R 4.1.1."+i+" C:\\Users\\nick\\Desktop\\test\\4.1.1."+i+".cpp");
//				cmdList.add("cmd /c vera++ -R 4.1.1."+i+" C:\\Users\\nick\\Desktop\\test\\4.1.1."+i+".cpp");
//				cmd[i-1] = "cmd /c vera++ -R 4.1.1."+i+" C:\\Users\\nick\\Desktop\\test\\4.1.1."+i+".cpp";
			}
			Process process = Runtime.getRuntime().exec(cmd);
			process.waitFor();
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String s = null;
			while ((s=br.readLine()) != null) {
				System.err.println("Error:"+s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		new Demo().fun();
	}
}
