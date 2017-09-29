package com.lzk.myCode.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) throws IOException {
		//创建高效字符流对象
		BufferedReader br = new BufferedReader(new FileReader("aaa.java"));
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("bbb.java"));
		
		//一次读取一个字符数组，一次写入一个字符数组的一部分
		char[] chs = new char[1024];
		//用来接收实际读取的长度
		int len = 0;
		while((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}
		
		//释放资源
		bw.close();
		br.close();
	}
}
