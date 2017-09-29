package com.lzk.myCode.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		//创建高效字符流对象
		BufferedReader br = new BufferedReader(new FileReader("aaa.java"));
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.java"));
		
		//一次读取一个字符，一次写入一个字符
		int ch = 0;
		while((ch = br.read()) != -1) {
			bw.write(ch);
		}
		
		//释放资源
		bw.close();
		br.close();
	}
}
