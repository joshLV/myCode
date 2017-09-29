package com.lzk.myCode.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		//创建字符输入流对象
		FileReader fr = new FileReader("aaa.java");
		//创建字符输出流对象
		FileWriter fw = new FileWriter("bbb.java");
		
		//一次读取一个字符，一次写入一个字符
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		
		//释放资源
		fw.close();
		fr.close();
	}
}
