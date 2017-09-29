package com.lzk.javaChm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class CreateDmJava {

	public static void main(String[] args) throws IOException {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("bbb.java"));
		//创建高效字符输出流对象
		//BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.java"));
		
		//使用高效字符输入流特有的方法，一次读取一个行
		//一次写入一个字符串
		StringBuffer sb = new StringBuffer();
		String line = null;
		
		while((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		String replaceAll = sb.toString().replaceAll("<([\\s\\S]*?)>", "").replace("&quot;", "\"").replace("\\u000a", "");
		System.out.println(replaceAll);
		
		//释放资源
		//bw.close();
		br.close();
	}
	
	@Test
	public void test1(){
		String str = "<!DOCTYPE HTML PUBLIC \"-//IETF//DTD HTML//EN\">\n<HTML>\n<HEAD>";
		String replace = str.replaceAll("<(.*?)>", "");
		System.out.println(replace);
	}
}
