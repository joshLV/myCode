package com.lzk.myCode.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo9 {
	public static void main(String[] args) throws IOException {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("aaa.java"));
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("bbb.java"));
		
		//使用高效字符输入流特有的方法，一次读取一个行
		//一次写入一个字符串
		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line);
			//换行
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
		br.close();
	}
}

