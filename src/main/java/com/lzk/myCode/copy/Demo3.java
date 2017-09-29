package com.lzk.myCode.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("aaa.java");
		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("a.java");
		
		//一次读取一个字节，一次写入一个字节
		int by = 0;
		while((by = fis.read()) != -1) {
			fos.write(by);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}
}

