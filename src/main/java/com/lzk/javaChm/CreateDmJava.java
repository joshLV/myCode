package com.lzk.javaChm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class CreateDmJava {

	public static void main(String[] args) throws IOException {
		//������Ч�ַ�����������
		BufferedReader br = new BufferedReader(new FileReader("bbb.java"));
		//������Ч�ַ����������
		//BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.java"));
		
		//ʹ�ø�Ч�ַ����������еķ�����һ�ζ�ȡһ����
		//һ��д��һ���ַ���
		StringBuffer sb = new StringBuffer();
		String line = null;
		
		while((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		String replaceAll = sb.toString().replaceAll("<([\\s\\S]*?)>", "").replace("&quot;", "\"").replace("\\u000a", "");
		System.out.println(replaceAll);
		
		//�ͷ���Դ
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
