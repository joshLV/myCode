package com.lzk.myCode.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		//创建字符输入流对象
		FileReader fr = new FileReader("aaa.java");
		//创建字符输出流对象
		FileWriter fw = new FileWriter("ccc.java");
		
		//一次读取一个字符数组，一次写入一个字符数组的一部分
		char[] chs = new char[1024];
		//用来接收实际读取的长度
		int len = 0;
		while((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}
		
		//释放资源
		fw.close();
		fr.close();
	}
}
