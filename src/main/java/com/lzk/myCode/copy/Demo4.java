package com.lzk.myCode.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("aaa.java");
		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("b.java");
		
		//一次读取一个字节数组，一次写入一个字节数组的一部门
		byte[] bys = new byte[1024];
		//用来接收实际读取的长度
		int len = 0;
		while((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}
}
