package com.lzk.myCode.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo8 {
	public static void main(String[] args) throws IOException {
		//创建高效字节输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aaa.java"));
		//创建高效字节输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ddd.java"));
		
		//一次读取一个字节数组，一次写入一个字节数组的一部门
		byte[] bys = new byte[1024];
		//用来接收实际读取的长度
		int len = 0;
		while((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		
		//释放资源
		bos.close();
		bis.close();
	}
}
