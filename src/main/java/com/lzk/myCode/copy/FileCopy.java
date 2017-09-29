package com.lzk.myCode.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入源文件地址...");
		File infile = getDri();
		System.out.println("请输入目的地地址...");
		File outfile = getDri();
		copy(infile,outfile);
	}

	private static void copy(File infile, File outfile){
		File[] files = infile.listFiles();
		File file = new File(outfile.getPath(),infile.getName());
		if (!file.exists()) {
			file.mkdirs();
		}
		for (File newfile : files) {
			System.out.println(newfile.getPath());
			if (newfile.isFile()) {
				try {
					BufferedInputStream br = new BufferedInputStream(new FileInputStream(newfile));
					String path = newfile.getName();
					BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(new File(file,path)));
					byte[] ch = new byte[1024*8];
					int len;
					while ((len=br.read(ch))!=-1) {
						bw.write(ch,0,len);
					}
					br.close();
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else if (newfile.isDirectory()) {
				copy(newfile,file);
			}
		}
		
	}

	private static File getDri() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.nextLine();
			File file = new File(line);
			if (file.isDirectory()) {
				return file;
			}else if (file.isFile()) {
				System.out.println("文件");
			}else {
				System.out.println("路径无效");
			}
		}
	}
}
