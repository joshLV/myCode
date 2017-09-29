package com.lzk.javaChm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class CreateDmJava {

	public static void main(String[] args) throws IOException {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("大漠帮助文档转全文本.java"));
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("大漠简化文档.java"));
		
		//使用高效字符输入流特有的方法，一次读取一个行
		//一次写入一个字符串
		StringBuffer sb = new StringBuffer();
		String line = null;
		
		while((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		String replace = Pattern.compile("\t|\r|\n").matcher(sb.toString()).replaceAll("\n")//全部替换成\n形式的换行符
				.replaceAll("<([\\s\\S]*?)>", "")//去掉<***> 标签
				.replace("&quot;", "\"")//替换引号
				.replace("&lt;", "<").replace("&gt;", ">").replace("&nbsp;", " ")//替换括号、空格
				.replaceAll("无标题文档([\\s\\S]*?)函数简介", "函数简介");//无标题文档--函数简介替换
		while(true){//去掉多余换行符
			int length = replace.length();
			replace = replace.replace("\n\n", "\n");
			replace = replace.replace("\n ", "\n");
			if (length == replace.length()) {
				break;
			}
		}
		//System.out.println(replace);
		String[] split = replace.split("函数简介");
		String dm = lineDM(split);
		bw.write(replace);
		
		//释放资源
		bw.close();
		br.close();
	}

	/**
	 * 拼接dm类
	 * @param split
	 * @return
	 */
	private static String lineDM(String[] split) {
		String methodTemplet =  "	public Object {method}({parmaT}){"+
								"		return Dispatch.call(dispatch, {method},{parma});"+
								"	}";
		for (String string : split) {
			System.out.println("函数简介"+string);
		}
		return null;
	}
}
